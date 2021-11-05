use master
go

if exists (select * from sys.databases where name ='FarmSys')
	drop DATABASE FarmSys
go

create database FarmSys
go

use FarmSys
go

Create table NhanVien (	
	MaNV varchar(15) primary key not null,
	MatKhau nvarchar(16)not null,
	HoTen nvarchar(50),
	GioiTinh int,
	Email nvarchar(30)not null,
	Luong int not null,
	VaiTro int,
	Hinh varchar(30) 
);

go
Create table DanTrong (	
	MaDan int IDENTITY(1,1) primary key not null,
	TenDan nvarchar(30) not null,
	TrangThai bit,
	/* "0: chưa trồng
		1: trồng" */
);
go
Create table LoaiCayTrong (	
	MaCay int IDENTITY(1,1) primary key not null,
	TenCay nvarchar(30)not null,
	ThoiGianThuHoach int not null,
	DoTDS float,
	DoPH float,
	NhietDo float,
	DoAm float,
	Hinh varchar(30) not null
);
go
Create table TrongCay (	
	MaDan int not null,
	MaCay int not null,
	NguoiTao varchar(15),
	NguoiTrong varchar(15),
	NgayTrong date,
	
	primary key(MaDan,MaCay),
	foreign key (MaDan) references DanTrong(MaDan),
	foreign key (MaCay) references LoaiCayTrong(MaCay),
	foreign key (NguoiTrong) references NhanVien(MaNV)
);
go
Create table NhatKy (	
	MaCV int IDENTITY(1,1),
	TenCV  int, /*   0.TRong cay, 1.Cham Soc, 2.Thu hoach  */
	ChiTiet nvarchar(200),
	NguoiTao varchar(15),
	NhanVien varchar(15),
	NgayBatDau date,
	NgayKetThuc date,
	TrangThai int 
	/* 0:  to do
		1: doing
		2: từ chối
		3: hoàn thành
		4: hoàn thành + trể */

	Primary key (MaCV),
	foreign key (Nhanvien) references NhanVien(MaNV),
);

SELECT DATEADD(day, +(LoaiCayTrong.ThoiGianThuHoach) , TrongCay.NgayTrong ) as 'ngaythuhoach' from LoaiCayTrong inner join TrongCay on LoaiCayTrong.MaCay = TrongCay.MaCay 
