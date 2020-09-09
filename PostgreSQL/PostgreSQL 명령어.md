# PostgreSQL 명령어



* 데이터베이스 생성

```psql
CREATE DATABASE 데이터베이스명;

# 예시
CREATE DATABASE test
```

![DB 생성](https://user-images.githubusercontent.com/48499094/92460157-94e34480-f202-11ea-8fb1-2c0d53ca1b10.PNG)



* 생성된 Database 목록 확인

```psql
\l
```

![db 목록확인](https://user-images.githubusercontent.com/48499094/92460200-a6c4e780-f202-11ea-9ef7-b3d80053827d.PNG)



* 접속한 Database 변경

```psql
\c [DB Name] [Connection User]

# 예시
\c test postgres
```

![db 이동캡처](https://user-images.githubusercontent.com/48499094/92460272-bc3a1180-f202-11ea-955d-7641e76743da.PNG)



* 테이블 생성

```psql
CREATE TABLE 테이블명(
	컬럼명 자료형 조건,
	...
);

# 예시
CREATE TABLE td_lot(
    lot_id serial PRIMARY KEY,
    name text NOT NULL,
    address text NOT NULL,
    service_type varchar(1) NOT NULL,
    time_ticket_yn boolean NOT NULL DEFAULT FALSE,
    day_ticket_yn boolean NOT NULL DEFAULT FALSE,
    month_ticket_yn boolean NOT NULL DEFAULT FALSE,
    capacity smallint,
    notice text,
    use_yn boolean NOT NULL DEFAULT TRUE,
    display_yn boolean NOT NULL DEFAULT TRUE,
    lat numeric(18,14) NOT NULL,
    lng numeric(18,14) NOT NULL,
    marker_type varchar(10) NOT NULL,
    partner_yn boolean NOT NULL,
    share_type varchar(10),
    public_yn boolean,
    outdoor_yn boolean NOT NULL,
    fulltime_yn boolean NOT NULL,
    no_elevator_yn boolean NOT NULL,
    created_date TIMESTAMP NOT NULL DEFAULT NOW(),
    created_by TEXT NOT NULL,
    modified_date TIMESTAMP,
    modified_by TEXT
);
```

![테이블 생성](https://user-images.githubusercontent.com/48499094/92460329-cf4ce180-f202-11ea-9cc7-927b89130a31.PNG)



* 테이블 상세 정보 조회

```psql
\d [Table Name]

# 예시
\d td_lot
```

![테이블 상세정보](https://user-images.githubusercontent.com/48499094/92460383-e1c71b00-f202-11ea-925f-bf4264796881.PNG)



* 테이블에 레코드 값 추가

```psql
INSERT INTO 테이블명 VALUES(레코드값, ...);

# 예시
INSERT INTO td_lot VALUES(1, '사근동 05-05', '서울특별시 성동구 사근동 마조로1길 30', 'A', TRUE, TRUE, TRUE, 1, NULL, TRUE, TRUE, 37.560035, 127.039232, 'time', TRUE, 'section', NULL, TRUE, TRUE, TRUE, CURRENT_TIMESTAMP, 'admin');
```

![레코드 생성](https://user-images.githubusercontent.com/48499094/92460439-f0adcd80-f202-11ea-8aad-20c0a7777291.PNG)



* 레코드 검색

```psql
SELECT 컬럼명 FROM 테이블명 WHERE 조건;

# 예시
SELECT * FROM td_lot;
```

![테이블 조회](https://user-images.githubusercontent.com/48499094/92460538-07542480-f203-11ea-8a1b-53b70c306cbf.PNG)



* 시간 계산
TIME 또는 TIMESTAMP의 처리는 WITH TIME ZONE 또는 WITHOUT TIME ZONE간에 다릅니다. 값이 저장되는 방식에는 영향을 미치지 않습니다. 해석 방법에 영향을줍니다.


#### 참고

* [PostgreSQL DOC / Date/Time Function and Operators](https://www.postgresql.org/docs/current/functions-datetime.html#FUNCTIONS-DATETIME-CURRENT)
* [PostgreSQL DOC / Date/Time Types](https://www.postgresql.org/docs/current/datatype-datetime.html)

* [알아두면 유용한 psql 명령어 정리](https://browndwarf.tistory.com/51)

