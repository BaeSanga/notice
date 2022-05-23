DROP TABLE tb_notice IF EXISTS;

CREATE TABLE tb_notice (                    --테이블 생성
      id        INTEGER IDENTITY PRIMARY KEY,           --정수 ID 기본 키
      userId    VARCHAR(30),
      title     VARCHAR(100),
      contents  VARCHAR(500),
      regDate   datetime,                --datetime 형식 : YYYY-MM-DD hh:mm:ss[.nnn]
      hit       INTEGER
);
CREATE INDEX tb_notice_id ON tb_notice (id);



-- char과 varchar 차이점 : char은 고정 길이 문자열 정보, varchar은 가변 길이 문자열 정보