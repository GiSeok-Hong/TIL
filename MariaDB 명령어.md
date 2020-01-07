# MariaDB 명령어

* 현재 설치된 DB 목록 확인하기

```mariadb
show databases;
```

* DB 생성하기

```mariadb
create database [데이터베이스 이름];

ex)
create database IT_HELP_U;
```

* 원하는 DB 사용하기

```mariadb
use [데이터베이스 이름];

ex)
use IT_HELP_U;
```

* 테이블 목록 확인하기

```mariadb
show tables;
```

* 데이터베이스 삭제

```mariadb
drop database [데이터베이스 이름];

ex)
drop database IT_HELP_U;
```

* 테이블에 대한 정보 확인

```mariadb
desc [테이블 이름];

ex)
desc mentors;
```



