
use FarmSys
go

select (SELECT DATEADD(day, +(LoaiCayTrong.ThoiGianThuHoach) , TrongCay.NgayTrong )) as 'ngaythuhoach' from LoaiCayTrong inner join TrongCay on LoaiCayTrong.MaCay = TrongCay.MaCay 
