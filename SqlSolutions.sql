SQL QUERY SOLUTIONS:-

1.)  SELECT * FROM EMPLOYEE;
2.) SELECT deptname, COUNT(*) FROM Dept GROUP BY deptname;
3.) SELECT cityid, COUNT(*) FROM City GROUP BY cityid;
4.) SELECT *  FROM EMPLOYEE WHERE salary BETWEEN (SELECT 1000) AND 3000;
5.) SELECT * FROM EMPLOYEE WHERE EXTRACT(YEAR FROM dob(CURRENT_DATE, doj)) > 15;
6.) SELECT * FROM EMPLOYEE WHERE doj>='2019-08-06' AND doj<='2022-06-25';
7.) select *, date_format(from_days(datediff(now(), doj)), '%Y') as age from emp where date_format(from_days(datediff(now(), doj)), '%Y')< 1;

8.) select * from emp where day(dob) in(31,21,6);

9.) select * from emp where DATE_FORMAT(FROM_DAYS(DATEDIFF(NOW(), dob)), '%Y')>= 45; 

10.) update emp set salary = salary + (salary * 15/100) where date_format(from_days(datediff(now(), doj)), '%Y')>5 and date_format(from_days(datediff(now(), doj)), '%Y')<10;

User Assignment:

1st:
select u.*,p.postid,count(p.postid) from user as u JOIN post as p on u.userid = p.userid
where u.userid = p.userid
group by u.username 
having count(p.userid) = (select max(count) from 
(select count(p.userid) as count FROM user AS u,post AS p   
where u.userid=p.userid  group by u.username ) AS c ) order by u.username;

2nd:
select u.*,p.postid,count(p.postid) from user as u JOIN post as p on u.userid = p.userid
where u.userid = p.userid
group by u.username 
having count(p.userid) = (select min(count) from 
(select count(p.userid) as count FROM user AS u,post AS p   
where u.userid=p.userid  group by u.username ) AS c ) order by u.username;

3rd:
select * from user u
join user_hobbies uh on u.userid = uh.userid
join hobbies h on h.hobyid = uh.hobyid
group by u.username having count(*) <3;

4th:
select * from user u
join user_hobbies uh on u.userid = uh.userid
join hobbies h on h.hobyid = uh.hobyid
group by u.username having count(*) =0;

5th:
select * from user u
join user_hobbies uh on u.userid = uh.userid
join hobbies h on h.hobyid = uh.hobyid
group by u.username having count(*) =1;

6th:
select * from user u
join post p on p.userid = u.userid
where p.date_time not in (CURRENT_DATE() - interval 7 day,CURRENT_DATE() - interval 14 day,CURRENT_DATE() - interval 30 day);

7th:
select * from user u
join post p on p.userid = u.userid
group by p.date_time having count(*) >=2;

8th:
select * from usercategory u join post p on p.userid = u.catid group by p.catid having count(*) >1;

9th:
select * from usercategory u join post p on p.userid = u.catid group by p.catid having count(*) =1;

10th: 
select * from category where catid not in(select catid from post);





