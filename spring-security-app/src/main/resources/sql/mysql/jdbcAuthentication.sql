create table USERS(
  USERNAME nvarchar(128) primary key,
  PASSWORD nvarchar(128) NOT Null,
  ENABLED CHAR(1) NOT null,
  CONSTRAINT chk_users_enabled CHECK(ENABLED IN ('Y','N') )
)
create table AUTHORITIES(
 USERNAME nvarchar(128) not null,
 AUTHORITY nvarchar(128) not null
)
alter table authorities add constraint uc_authorities unique(USERNAME,AUTHORITY);
alter table authorities add constraint fk_authorities_users foreign key(USERNAME) references USERS(USERNAME);



