
create table VISIT_T(
   id number primary key,
   context varchar2(500 char),
   nickname varchar2(25 char)
);

insert into visit_t values(1,'context','nickname');
insert into visit_t values(2,'context','nickname');
insert into visit_t values(3,'context','nickname');
select * from visit_t;


drop table visit_t;
delete from visit_t;


create sequence visit_s;
select visit_s.nextval from dual;

commit;



create table bookmark_T(
   id number primary key,
   url varchar2(50 char),
   name varchar2(25 char)
);


insert into BOOKMARK_T values(1,'https://naver.com','네이버');
insert into BOOKMARK_T values(2,'https://google.com','구글');
insert into BOOKMARK_T values(3,'https://nate.com','네이트');


commit;

delete from BOOKMARK_T ;
drop table BOOKMARK_T ;

select * from BOOKMARK_T ;
commit;

select max(id) from BOOKMARK_T;


create sequence BOOKMARK_S;
select BOOKMARK_S.NEXTVAL from dual;
drop sequence bookmark_S;



create table user_T(
   USERID varchar2(20) primary key,
   password varchar2(20),
   email varchar2(100)

);
select * from user_t;
commit;


drop table bookmark_T;

create table bookmark_T(
   id number primary key,
   USERID varchar2(20) references USER_T(USERID),
   url varchar2(50 char),
   name varchar2(25 char)
);

select * from BOOKMARK_T;
commit;


create table t_member(
	id varchar2(20) primary key,
	pwd varchar2(10),
	name varchar2(50),
	email varchar2(50),
	joinDate date default sysdate
);
insert into t_member values('hong','1212','홍길동','hong@gmail.com',sysdate);
insert into t_member values('lee','1212','이순신','lee@gmail.com',sysdate);
insert into t_member values('kim','1212','김유신','kim@gmail.com',sysdate);
commit;
select * from t_member;



