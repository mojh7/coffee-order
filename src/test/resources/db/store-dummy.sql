INSERT INTO owner (biz_num, account, password, name, created_at, updated_at)
VALUES ('123-45-67890', 'owner1', 'password1', '사장님1', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO store (owner_id, name, lat, lng, address, status, created_at, updated_at)
VALUES
    (1, '커피점1', 37.1, 127.1, '서울시 강남구 역삼동 1번지', 'OPEN', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (1, '커피점2', 37.2, 127.2, '서울시 강남구 역삼동 2번지', 'OPEN', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (1, '커피점3', 37.3, 127.3, '서울시 서초구 서초동 1번지', 'OPEN', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (1, '커피점4', 37.4, 127.4, '서울시 서초구 서초동 2번지', 'PREPARING', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (1, '커피점5', 37.5, 127.5, '서울시 강남구 삼성동 1번지', 'CLOSED', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);