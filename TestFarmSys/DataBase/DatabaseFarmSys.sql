﻿use master
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
		4: hoàn thành + trể 
		5: buy */
		

	Primary key (NhanVien,TenGian,TenCay,TenCV),
	
	foreign key (NhanVien) references NhanVien(MaNV),
	foreign key (TenGian) references GianTrong(TenGian),
	foreign key (TenCay) references LoaiCay(TenCay),
	foreign key (TenCV) references CongViec(TenCV)
	
);
go

Create table KhoHang(
	MaTH int IDENTITY(1,1),
	TenGian nvarchar(30),
	TenCay nvarchar(30),
	TrongLuong float,
	ThoiGianThuHoach date,
	Coin float,

	Primary key (MaTH),
	foreign key (TenGian) references GianTrong(TenGian),
	foreign key (TenCay) references LoaiCay(TenCay)
);
go


insert into NhanVien 
values 
 ('Trung','240102',N'Vương Nguyên Trung',1,'trung@fpt.edu.vn',10000000,1,'a.png',null),
 ('TrieuNHD','123456',N'Nguyễn Huỳnh Đông Triều',1,'trieu@fpt.edu.vn',10000000,0,'b.png',null),
 ('Tri','123456',N'Nguyễn Diệp Thế Tri',1,'Tri@fpt.edu.vn',10000000,0,'c.png',null),
 ('Dung','123456',N'Trần Tiến Dũng',1,'Dung@fpt.edu.vn',2000000,0,'d.png',null),
 ('Hai','123456',N'Giáp Văn Hải',1,'Hai@fpt.edu.vn',10000000,0,'e.png',null),
 ('Tuan','123456',N'Đinh Quang Tuấn',1,'Tuan@fpt.edu.vn',10000000,0,'f.png',null)
 go

 insert into GianTrong (TenGian,TrangThai)
 values 
	 ('A1','0'),
	 ('A2','0'),
	 ('A3','0'),
	 ('A4','0'),
	 ('A5','0'),
	 ('A6','0'),
	 ('A7','0'),
	 ('A8','0'),
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
(N'Rau mầm','30','1260','3.5','28','18','Hinh1.jpg'),
(N'Rau muống','25','1300','2.7','30','12','Hinh2.jpg'),
(N'Rau xà lách','15','1000','7.0','27','13','Hinh3.jpg'),
(N'Rau cầu vòng','20','1750','3.8','32','11','Hinh4.jpg'),
(N'Rau bina (Cải bó xôi)','23','2590','3.8','32','15','Hinh5.jpg'),
(N'Rau cải ngọt','37','2500','2.9','29','16','Hinh6.jpg'),
(N'Rau cải xanh','40','2000','5.6','27','20','Hinh7.jpg'),
(N'Rau cải xoan','19','2800','5.2','28','21','Hinh8.jpg'),
(N'Rau dền','18','1280','4.7','27','19','Hinh9.jpg'),
(N'Cần tây','32','1370','4.8','29','16','Hinh10.jpg'),
(N'Cây cà chua','34','1120','4.8','26','17','Hinh11.jpg'),
(N'Cây dưa leo','35','3000','6.6','31','21','Hinh12.jpg'),
(N'Rau húng quế','15','2570','6.6','33','09','Hinh13.jpg'),
(N'Rau mồng tơi','15','2180','6.5','30','11','Hinh14.jpg'),
(N'Tía tô','15','1290','6.9','29','12','Hinh15.jpg')
go

insert into CongViec (TenCV)
values 
(N'Trồng cây'),
(N'Chăm sóc'),
(N'Thu hoạch')
go

insert into NhatKy (TenCV,TenCay,TenGian,ChiTiet,NguoiTao,NhanVien,NgayBatDau,NgayKetThuc,TrangThai)
values 
 (N'Trồng cây',N'Rau mầm','A1',N'Trồng cây giàn A1','Trung','TrieuNHD','2020-12-28','2021-12-29','5'),
 (N'Trồng cây',N'Rau dền','A2',N'Trồng cây giàn A2','Trung','Dung','2021-01-15','2021-01-16','5'),
 (N'Trồng cây',N'Rau muống','A3',N'Trồng cây giàn A3','Trung','Tri','2021-02-13','2021-02-14','5'),
 (N'Trồng cây',N'Rau cải ngọt','A4',N'Trồng cây giàn A4','Trung','Tuan','2021-02-26','2021-02-27','5'),
 (N'Trồng cây',N'Rau xà lách','A5',N'Trồng cây giàn A5','Trung','Hai','2021-05-07','2021-05-08','5'),
 (N'Trồng cây',N'Rau cầu vòng','A6',N'Trồng cây giàn A6','Trung','TrieuNHD','2021-06-03','2021-06-04','5'),
 (N'Trồng cây',N'Rau mồng tơi','A7',N'Trồng cây giàn A7','Trung','Dung','2021-07-07','2021-07-08','5'),
 (N'Trồng cây',N'Cây dưa leo','A8',N'Trồng cây giàn A8','Trung','Tri','2021-07-19','2021-07-20','5'),
 (N'Trồng cây',N'Tía tô','A9',N'Trồng cây giàn A9','Trung','Tuan','2021-09-08','2021-09-09','5'),
 (N'Trồng cây',N'Cây cà chua','A10',N'Trồng cây giàn A10','Trung','Hai','2021-09-19','2021-09-20','5'),
 (N'Trồng cây',N'Rau cải xanh','B1',N'Trồng cây giàn B1','Trung','Dung','2021-10-06','2021-10-07',''),

 (N'Thu hoạch',N'Rau mầm','A1',N'Thu hoạch giàn A1','Trung','Dung','2021-01-16','2021-01-17','3'),
 (N'Thu hoạch',N'Rau dền','A2',N'Thu hoạch giàn A2','Trung','TrieuNHD','2021-02-03','2021-02-04','3'),
 (N'Thu hoạch',N'Rau muống','A3',N'Thu hoạch giàn A3','Trung','Tri','2021-03-11','2021-03-12','3'),
 (N'Thu hoạch',N'Rau cải ngọt','A4',N'Thu hoạch giàn A4','Trung','Tuan','2021-04-04','2021-04-05','3'),
 (N'Thu hoạch',N'Rau xà lách','A5',N'Thu hoạch giàn A5','Trung','Hai','2021-05-23','2021-05-24','3'),
 (N'Thu hoạch',N'Rau cầu vòng','A6',N'Thu hoạch giàn A6','Trung','TrieuNHD','2021-06-23','2021-06-24','3'),
 (N'Thu hoạch',N'Rau mồng tơi','A7',N'Thu hoạch giàn A7','Trung','Dung','2021-07-23','2021-07-24','3'),
 (N'Thu hoạch',N'Cây dưa leo','A8',N'Thu hoạch giàn A8','Trung','Tri','2021-08-23','2021-08-24','3'),
 (N'Thu hoạch',N'Tía tô','A9',N'Thu hoạch giàn A9','Trung','Hai','2021-09-23','2021-09-24','3'),
 (N'Thu hoạch',N'Cây cà chua','A10',N'Thu hoạch giàn A10','Trung','Tuan','2021-10-23','2021-10-24','3'),
 (N'Thu hoạch',N'Rau cải xanh','B1',N'Thu hoạch giàn A10','Trung','TrieuNHD','2021-11-15','2021-11-16','3')
 go


/*
select NhatKy.TenGian,LoaiCay.TenCay,(SELECT DATEADD(day, +(LoaiCay.ThoiGianThuHoach) , NhatKy.NgayKetThuc)) as 'NgayTH' from LoaiCay inner join NhatKy on LoaiCay.TenCay = NhatKy.TenCay where TenCV like N'Trồng cây' and GETDATE() >= (SELECT DATEADD(day, +(LoaiCay.ThoiGianThuHoach) , NhatKy.NgayKetThuc))
select * from NhatKy 
select *from NhatKy where TrangThai = 3 and NhanVien like N'TrieuNHD' and  NgayKetThuc between (select CONVERT(varchar,dateadd(d,-(day(getdate()-1)),getdate()),106)) and (select CONVERT(varchar,dateadd(d,-(day(dateadd(m,1,getdate()))),dateadd(m,1,getdate())),106))
select NhatKy.TenGian,LoaiCay.TenCay,(SELECT DATEADD(day, +(LoaiCay.ThoiGianThuHoach) , NhatKy.NgayKetThuc)) as 'NgayTH' from LoaiCay inner join NhatKy on LoaiCay.TenCay = NhatKy.TenCay where TenCV like N'Trồng cây' and GETDATE() >= (SELECT DATEADD(day, +(LoaiCay.ThoiGianThuHoach) , NhatKy.NgayKetThuc)) and TrangThai = 2
*/
insert into KhoHang (TenGian,TenCay,TrongLuong,ThoiGianThuHoach,Coin)
values
	('A1',N'Rau mầm','240','2021-01-17','2700'),
	('A2',N'Rau dền','250','2021-02-04','3700'),
	('A3',N'Rau muống','300','2021-03-12','2800'),
	('A4',N'Rau cải ngọt','350','2021-04-05','2100'),
	('A5',N'Rau xà lách','500','2021-05-24','1500'),
	('A6',N'Rau cầu vòng','156','2021-06-24','4100'),
	('A7',N'Rau mồng tơi','320','2021-07-24','2000'),
	('A8',N'Cây dưa leo','500','2021-08-24','2140'),
	('A9',N'Tía tô','345','2021-09-24','2520'),
	('A10',N'Cây cà chua','567','2021-10-24','4023'),
	('B1',N'Rau cải xanh','535','2021-11-16','3076')
go


select distinct (select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/01/01' and '2021/01/31') as 'TongTien01',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/02/01' and '2021/02/28')as 'TongTien02',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/03/01' and '2021/03/31')as 'TongTien03',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/04/01' and '2021/04/30')as 'TongTien04',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/05/01' and '2021/05/31')as 'TongTien05',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/06/01' and '2021/06/30')as 'TongTien06',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/07/01' and '2021/07/31')as 'TongTien07',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/08/01' and '2021/08/31')as 'TongTien08',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/09/01' and '2021/09/30')as 'TongTien09',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/10/01' and '2021/10/31')as 'TongTien10',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/11/01' and '2021/11/30')as 'TongTien11',
		(select SUM(coin) from KhoHang where ThoiGianThuHoach between '2021/12/01' and '2021/12/31')as 'TongTien12'
		from KhoHang


select * from LoaiCay
























