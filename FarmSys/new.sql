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
	MatKhau varchar(16) not null,
	HoTen nvarchar(50) not null,
	GioiTinh int,
	Email nvarchar(30)not null,
	Luong int,
	VaiTro bit not null,
	Hinh varchar(30) 
);
go

Create table GianTrong (	
	MaGian int IDENTITY(0,1) primary key not null,
	TenGian nvarchar(30) not null,
	TrangThai bit,
	/* "0: chưa trồng
		1: trồng" */
);
go

Create table LoaiCayTrong (	
	MaCay int IDENTITY(0,1) primary key not null,
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
	MaGian int not null,
	MaCay int not null,
	NguoiTao varchar(15),
	NguoiTrong varchar(15),
	NgayTrong date,
	
	primary key (MaGian,MaCay),
	foreign key (MaGian) references GianTrong(MaGian),
	foreign key (MaCay) references LoaiCayTrong(MaCay),
	foreign key (NguoiTrong) references NhanVien(MaNV)
);
go

create table CongViec(
	TenCV int primary key,
	MoTa nvarchar(200),
	MaGian int ,
	NguoiGiaoViec varchar(15),
	NguoiNhanViec varchar(15),
	NgayBatDau date,
	NgayKetThuc date,
	foreign key (MaGian) references GianTrong(MaGian),
	foreign key (NguoiNhanViec) references NhanVien(MaNV)
);
go

Create table NhatKy (	
	MaCV int IDENTITY(0,1),
	TenCV  int, /*   0.TRong cay, 1.Cham Soc, 2.Thu hoach  */
	MaGian int ,
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

	Primary key (MaCV,TenCV),
	foreign key (Nhanvien) references NhanVien(MaNV),
	foreign key (MaGian) references GianTrong(MaGian),

	foreign key (TenCV) references CongViec(TenCV),
	
	

);
go


insert into NhanVien 
values 
 ('Trung','240102',N'Vương Nguyên Trung',1,'trung@fpt.edu.vn',10000000,1,'a.png'),
 ('TrieuNHD','123456',N'Nguyễn Huỳnh Đông Triều',0,'trieu@fpt.edu.vn',10000000,0,'b.png'),
 ('Tri','123456',N'Nguyễn Diệp Thế Tri',0,'Tri@fpt.edu.vn',10000000,0,'c.png'),
 ('Dung','123456',N'Trần Tiến Dũng',0,'Dung@fpt.edu.vn',2000000,0,'d.png'),
 ('Hai','123456',N'Giáp Văn Hải',0,'Hai@fpt.edu.vn',10000000,0,'e.png'),
 ('Tuan','123456',N'Đinh Quang Tuấn',0,'Tuan@fpt.edu.vn',10000000,0,'f.png')
 go

 insert into GianTrong (TenGian,TrangThai)
 values 
	 ('A1','1'),
	 ('A2','1'),
	 ('A3','1'),
	 ('A4','1'),
	 ('A5','1'),
	 ('A6','1'),
	 ('A7','1'),
	 ('A8','1'),
	 ('A9','0'),
	 ('A10','0'),
	 ('B1','0'),
	 ('B2','0'),
	 ('B3','0'),
	 ('B4','0'),
	 ('B5','0'),
	 ('B6','0'),
	 ('B7','0'),
	 ('B8','0'),
	 ('B9','0'),
	 ('B10','0'),
	 ('C1','0'),
	 ('C2','0'),
	 ('C3','0'),
	 ('C4','0'),
	 ('C5','0'),
	 ('C6','0'),
	 ('C7','0'),
	 ('C8','0'),
	 ('C9','0'),
	 ('C10','0')
 go
 
 INSERT INTO LoaiCayTrong VALUES (N'Cây Chuối','30','1260','3.5','28','18','Hinh1.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Việt Quốc','25','1300','2.7','30','12','Hinh2.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Dưa Lưới','15','1000','7.0','27','13','Hinh3.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Đu Đủ','20','1750','3.8','32','11','Hinh4.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Dưa Hấu','23','2590','3.8','32','15','Hinh5.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Măng Tây','37','2500','2.9','29','16','Hinh6.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Bông Cải Xanh','40','2000','5.6','27','20','Hinh7.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Củ Dền','19','2800','5.2','28','21','Hinh8.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Cải Bắp','18','1280','4.7','27','19','Hinh9.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Đậu Hà Lan','32','1370','4.8','29','16','Hinh10.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Cà Chua','34','1120','4.8','26','17','Hinh11.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Bắp','35','3000','6.6','31','21','Hinh12.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Bí Ngô','15','2570','6.6','33','09','Hinh13.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Khoai Tây','15','2180','6.5','30','11','Hinh14.jpg');
INSERT INTO LoaiCayTrong VALUES (N'Cây Hành','15','1290','6.9','29','12','Hinh15.jpg');
go

insert into TrongCay (MaGian,MaCay,NguoiTao,NguoiTrong,NgayTrong)
values 
 ('1','1','Trung','TrieuNHD','2021-11-05'),
 ('2','2','Trung','TrieuNHD','2021-11-04'),
 ('3','4','Trung','Tri','2021-11-03'),
 ('4','6','Trung','Tri','2021-11-02'),
 ('5','5','Trung','Dung','2021-11-01'),
 ('6','8','Trung','Dung','2021-11-01'),
 ('7','4','Trung','Hai','2021-11-02'),
 ('8','6','Trung','Hai','2021-11-03')
 go

 insert into CongViec (TenCV,MaGian,MoTa,NguoiGiaoViec,NguoiNhanViec,NgayBatDau,NgayKetThuc)
values 
 ('1','1','Trồng cây giàn A1','Trung','TrieuNHD','2021-11-05','2021-11-06')
 go

 insert into NhatKy (TenCV,MaGian,ChiTiet,NguoiTao,NhanVien,NgayBatDau,NgayKetThuc,TrangThai)
values 
 ('1','1','Trồng cây giàn A1','Trung','TrieuNHD','2021-11-05','2021-11-06','0')
 go
