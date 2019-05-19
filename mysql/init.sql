create table lesson (
	id int primary key not null auto_increment comment 'id',
	title varchar(45) not null comment '名前'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='アーティスト';

create table contents (
	id int primary key not null auto_increment comment 'id',
	lesson_id int not null comment 'lesson id',
	jp_text varchar(512) not null comment 'japanese text',
	en_text varchar(512) not null comment 'english text',
	CONSTRAINT fk_lesson_id
        FOREIGN KEY (lesson_id)
        REFERENCES lesson (lesson_id)
        ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='ミュージック';

insert into lesson (id, title) value (1, 'test1');
insert into lesson (id, title) value (2, 'test2');
insert into lesson (id, title) value (3, 'Making Friends');
insert into lesson (id, title) value (4, 'Summary Lesson 1');
insert into lesson (id, title) value (5, 'Preparation');

insert into contents (lesson_id, jp_text, en_text) value (1, "彼は無事にニューヨークに着陸し、予定通りブライアンの出迎えを受けます。",  "He lands successfully in New York City and meets Brian as planned.");
insert into contents (lesson_id, jp_text, en_text) value (1, "私たちは常に効率よく働くよう心がけています。", "We always try to work efficiently.");
insert into contents (lesson_id, jp_text, en_text) value (1, "ニューヨークに着いた後は、まずマディソンスクエアガーデンに行くつもりです。", "After I arrive at New York, I will visit Madison Square Garden first.");
insert into contents (lesson_id, jp_text, en_text) value (1, "もしこの椅子が100ドル以下なら買います。", "If this chair is less than $100, I will buy it.");
insert into contents (lesson_id, jp_text, en_text) value (1, "私が旅をした時は、大抵の場合、銀行に行ってみてなり行き任せでやりました。", "When I traveled, I usually go to the bank and play it by ear.");
insert into contents (lesson_id, jp_text, en_text) value (1, "あなたが電話してきた時、私は席を外していました。", "I wasn't at my desk when you called me.");
insert into contents (lesson_id, jp_text, en_text) value (1, "私はその製品について問い合わせました。", "I inquired about the product.");
insert into contents (lesson_id, jp_text, en_text) value (1, "我が社は、似ているモデルについて学ばなければならないでしょう。", "We will have to learn about similar models.");
insert into contents (lesson_id, jp_text, en_text) value (1, "その会社は本社移転を予定しています。", "The company is planned to relocate its headquarters.");
