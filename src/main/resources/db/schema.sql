DROP TABLE tb_notice IF EXISTS;

CREATE TABLE tb_notice (
      id        INTEGER IDENTITY PRIMARY KEY,
      userId    VARCHAR(30),
      title     VARCHAR(100),
      contents  varchar(500),
      regDate   datetime,
      hit       INTEGER
);
CREATE INDEX tb_notice_id ON tb_notice (id);