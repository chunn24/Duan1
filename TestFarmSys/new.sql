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
	GioiTinh bit,
	Email nvarchar(30)not null,
	Luong int,
	VaiTro bit not null,
	Hinh varchar(30) ,
	QRcode varchar(40)
);
go

Create table GianTrong (	
	MaGian int IDENTITY(1,1),
	TenGian nvarchar(30),
	TrangThai bit,
	/* "0: chưa trồng
		1: trồng" */

	primary key(TenGian)
);
go

Create table LoaiCay (	
	MaCay int IDENTITY(1,1)  not null,
	TenCay nvarchar(30) primary key not null,
	ThoiGianThuHoach int not null,
	DoTDS float,
	DoPH float,
	NhietDo float,
	DoAm float,
	Hinh varchar(30) not null
);
go
Create table CongViec(
	STT int IDENTITY(1,1),
	TenCV nvarchar(30) primary key
);

Create table NhatKy (	
	STT int IDENTITY(1,1),
	TenCV nvarchar(30), 
	TenCay nvarchar(30),
	TenGian nvarchar(30),
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

	Primary key (NhanVien,TenGian,TenCay,TenCV),
	
	foreign key (NhanVien) references NhanVien(MaNV),
	foreign key (TenGian) references GianTrong(TenGian),
	foreign key (TenCay) references LoaiCay(TenCay),
	foreign key (TenCV) references CongViec(TenCV)
	
);
go

Create table ThuHoach (	
	TenGian nvarchar(30),
	TenCay nvarchar(30),
	Soluong int,	
	NgayBatDau date,
	NgayKetThuc date,
	TrangThai int 
	/* 1 là bán
	   0 là chưa bán*/

	Primary key (NhanVien,TenGian,TenCay,TenCV),
	
	foreign key (NhanVien) references NhanVien(MaNV),
	foreign key (TenGian) references GianTrong(TenGian),
	foreign key (TenCay) references LoaiCay(TenCay),
	foreign key (TenCV) references CongViec(TenCV)
	
);
go

insert into NhanVien 
values 
 ('Trung','240102',N'Vương Nguyên Trung',0,'trung@fpt.edu.vn',10000000,1,'a.png',null),
 ('TrieuNHD','123456',N'Nguyễn Huỳnh Đông Triều',0,'trieu@fpt.edu.vn',10000000,0,'b.png',null),
 ('Tri','123456',N'Nguyễn Diệp Thế Tri',0,'Tri@fpt.edu.vn',10000000,0,'c.png',null),
 ('Dung','123456',N'Trần Tiến Dũng',0,'Dung@fpt.edu.vn',2000000,0,'d.png',null),
 ('Hai','123456',N'Giáp Văn Hải',0,'Hai@fpt.edu.vn',10000000,0,'e.png',null),
 ('Tuan','123456',N'Đinh Quang Tuấn',0,'Tuan@fpt.edu.vn',10000000,0,'f.png',null)
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
 
INSERT INTO LoaiCay 
VALUES 
(N'Cây chuối','30','1260','3.5','28','18','Hinh1.jpg'),
(N'Cây việt quốc','25','1300','2.7','30','12','Hinh2.jpg'),
(N'Cây dưa lưới','15','1000','7.0','27','13','Hinh3.jpg'),
(N'Cây đu đủ','20','1750','3.8','32','11','Hinh4.jpg'),
(N'Cây Dưa Hấu','23','2590','3.8','32','15','Hinh5.jpg'),
(N'Cây Măng Tây','37','2500','2.9','29','16','Hinh6.jpg'),
(N'Cây Bông Cải Xanh','40','2000','5.6','27','20','Hinh7.jpg'),
(N'Cây Củ Dền','19','2800','5.2','28','21','Hinh8.jpg'),
(N'Cây Cải Bắp','18','1280','4.7','27','19','Hinh9.jpg'),
(N'Cây Đậu Hà Lan','32','1370','4.8','29','16','Hinh10.jpg'),
(N'Cây Cà Chua','34','1120','4.8','26','17','Hinh11.jpg'),
(N'Cây Bắp','35','3000','6.6','31','21','Hinh12.jpg'),
(N'Cây Bí Ngô','15','2570','6.6','33','09','Hinh13.jpg'),
(N'Cây Khoai Tây','15','2180','6.5','30','11','Hinh14.jpg'),
(N'Cây Hành','15','1290','6.9','29','12','Hinh15.jpg')
go

insert into CongViec (TenCV)
values 
(N'Trồng cây'),
(N'Chăm sóc'),
(N'Thu hoạch')
go

 insert into NhatKy (TenCV,TenCay,TenGian,ChiTiet,NguoiTao,NhanVien,NgayBatDau,NgayKetThuc,TrangThai)
values 
 (N'Trồng cây',N'Cây Chuối','C9',N'Trồng cây giàn A1','Trung','TrieuNHD','2021-11-05','2021-11-06','0'),
 (N'Chăm sóc',N'Cây Chuối','C9',N'Trồng cây giàn A2','Trung','TrieuNHD','2021-11-05','2021-11-06','1')
 go



select (SELECT DATEADD(day, +(LoaiCay.ThoiGianThuHoach) , NhatKy.NgayBatDau )) as 'ngaythuhoach' from LoaiCay inner join NhatKy on LoaiCay.TenCay = NhatKy.TenCay
