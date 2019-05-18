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

insert into contents (lesson_id, jp_text, en_text) value (1, 'テスト', 'test');
insert into contents (lesson_id, jp_text, en_text) value (1, 'テスト2', 'test2');
