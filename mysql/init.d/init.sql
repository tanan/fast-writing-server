create database fast_writing;

use fast_writing;

create table users (
	id int primary key not null auto_increment comment 'id',
	login_id varchar(64) not null comment 'ログインID',
	password varchar(128) not null comment 'パスワード',
	create_time timestamp not null default CURRENT_TIMESTAMP,
	update_time timestamp not null default CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='ユーザー';

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
        REFERENCES lesson (id)
        ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='ミュージック';

insert into lesson (id, title) value
(1, 'Going to America'),
(2, 'Setting In'),
(3, 'Making Friends'),
(4, 'Summary Lesson 1'),
(5, 'Building Relationships'),
(6, 'Preparation'),
(7, 'Preparation'),
(8, 'Preparation'),
(9, 'Preparation'),
(10, 'Preparation'),
(11, 'Preparation'),
(12, 'Preparation'),
(13, 'Preparation'),
(14, 'Preparation');

insert into contents (lesson_id, jp_text, en_text) value
(1, "私は働きます", "I work"),
(1, "彼は毎朝6時におきます", "He get up at 6:00 every day."),
(1, "あなたは何も持っていない", "You have nothing."),
(1, "航空券には8:30と記載されています", "The boarding pass says 8:30."),
(1, "私の写真を見せてあげます", "I will show you my picture."),
(1, "彼らは私にコーヒーを入れてくれました。", "They made me some coffee."),
(1, "私はそのレッスンは面白いと思いました。", "I found the lesson interesting."),
(1, "彼は自分の部屋を綺麗にしていた。", "He kept his room clean."),
(2, "彼は無事にニューヨークに着陸し、予定通りブライアンの出迎えを受けます。",  "He lands successfully in New York City and meets Brian as planned."),
(2, "私たちは常に効率よく働くよう心がけています。", "We always try to work efficiently."),
(2, "ニューヨークに着いた後は、まずマディソンスクエアガーデンに行くつもりです。", "After I arrive at New York, I will visit Madison Square Garden first."),
(2, "もしこの椅子が100ドル以下なら買います。", "If this chair is less than $100, I will buy it."),
(2, "私が旅をした時は、大抵の場合、銀行に行ってみてなり行き任せでやりました。", "When I traveled, I usually go to the bank and play it by ear."),
(2, "あなたが電話してきた時、私は席を外していました。", "I wasn't at my desk when you called me."),
(2, "私はその製品について問い合わせました。", "I inquired about the product."),
(2, "我が社は、似ているモデルについて学ばなければならないでしょう。", "We will have to learn about similar models."),
(2, "その会社は本社移転を予定しています。", "The company is planned to relocate its headquarters."),
(2, "佐藤氏は高崎と東京の間を新幹線で通勤しています。", "Mr. Sato commutes between Takasaki and Tokyo by Shinkansen"),
(2, "もしこの椅子が100ドル以下なら買います", "If this chair is less than 100 dollars, I'll buy it."),
(3, "入社したてですか。", "Are you new to the company?"),
(3, "会社は新しい販促キャンペーンに着手したんですか。", "Has the company launched a new promotion campaign?"),
(3, "その書類はいつまでに必要ですか。", "How soon do you neeed the document?"),
(3, "ニューヨークにどのくらいいるつもりですか。", "How long will you be in New York?"),
(3, "次の役員会議はいつ開かれるか知っていますか。", "Do you know when the next board meeting is held?"),
(3, "まだ船積み日を再確認していないのですか", "Haven't you recomfirmed the shipping date yet?"),
(3, "明日は記者会見がありますよね。", "We are holding a press conference tomorrow, aren't we?"),
(3, "お申込み書に記入されていませんよね。", "You haven't filled out the application form, have you?"),
(3, "現金でお支払いになりますか、それともクレジットカードでお支払いになりますか。", "Would you like to pay in cash or by credit card?");
