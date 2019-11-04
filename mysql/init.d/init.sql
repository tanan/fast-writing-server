create database fast_writing;

use fast_writing;

create table users (
	id int primary key not null auto_increment comment 'User ID',
	login_id varchar(64) not null comment 'Login ID',
	password varchar(128) not null comment 'Password',
	nickname varchar(32) null comment 'Nickname',
	note varchar(128) null comment 'Note',
	create_time timestamp not null default CURRENT_TIMESTAMP,
	update_time timestamp not null default CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Users';

create table lessons (
	id int primary key not null auto_increment comment 'id',
	title varchar(45) not null comment 'タイトル',
	description varchar(128) not null comment '説明'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Lessons';

create table contents (
	id int primary key not null auto_increment comment 'id',
	lesson_id int not null comment 'lesson id',
	jp_text varchar(512) not null comment 'japanese text',
	en_text varchar(512) not null comment 'english text',
	CONSTRAINT fk_lesson_id
        FOREIGN KEY (lesson_id)
        REFERENCES lessons (id)
        ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Lesson Contents';

create table user_defined_lessons (
	id int primary key not null auto_increment comment 'id',
	user_id int not null comment 'ユーザーid',
	title varchar(45) not null comment 'タイトル',
	description varchar(128) not null comment '説明',
	create_time timestamp not null default CURRENT_TIMESTAMP,
    update_time timestamp not null default CURRENT_TIMESTAMP,
    CONSTRAINT fk_user_id
        FOREIGN KEY (user_id)
        REFERENCES users (id)
        ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='User Defined Lessons';

create table user_defined_contents (
	id int primary key not null auto_increment comment 'id',
	user_defined_lesson_id int not null comment 'lesson id',
	jp_text varchar(512) not null comment 'japanese text',
	en_text varchar(512) not null comment 'english text',
	CONSTRAINT fk_user_defined_lesson_id
        FOREIGN KEY (user_defined_lesson_id)
        REFERENCES user_defined_lessons (id)
        ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='ミュージック';

insert into users (id, login_id, password) value
(1, 'toshifumi.anan', '$2a$04$V.Ztd707YKlKcjRQ.z6Bh.0LpHnTBuU5hMgkBbxdDxch1LriKTiBW');

insert into lessons (id, title, description) value
(1, 'Going to America', 'description1'),
(2, 'Setting In', 'description2'),
(3, 'Making Friends', 'description3'),
(6, 'Setting Up a Meeting', 'description6'),
(7, 'Following Up', 'description7'),
(9, 'Lesson9', 'description9'),
(14, 'Lesson14', 'description14');

insert into user_defined_lessons (id, user_id, title, description) value
(1, 1, 'Your Lesson', 'your custom lesson 1');

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
(3, "現金でお支払いになりますか、それともクレジットカードでお支払いになりますか。", "Would you like to pay in cash or by credit card?"),
(6, "私たちの多くの顧客は、ずっとテクノロジー企業です。", "Many of our clients have been tech companies."),
(6, "あなたの会社は急速に成長してきていますよね？", "Your company has been growing rapidly, hasn't it?"),
(6, "私はもう来週のプレゼン準備を終えています。", "I have already finished prepairing for the presentation next week."),
(6, "あなたはその銀行に何年間勤務していますか？", "How many have you been working for the bank?"),
(6, "我が社は10年間、事業を中国に拡大しております。", "We have been expanding our business into China for a decade."),
(6, "私が会議室についた時、会議はすでに始まっていた。", "When I got to the conference room, the meeting had already started."),
(6, "彼らは以前ダウンロードしたデータを破棄した", "They discarded the data they had downloaded before."),
(6, "私は上司が来るまで、１時間ずっとそのファイルを探していました。", "I had been looking for the file for an hour before the boss came into our room."),
(6, "あなたが退社する時までには、新しいシステムはインストールされるでしょう。", "The new system will have been installed by the time you leave the office."),
(6, "今度の水曜日までには、その提案は承認されるでしょう。", "The proposal will have been approved by next Wednesday."),
(7, "私に任せてくれない？そのプランの決定を", "Can you give me a free hand in diciding the plan?"),
(7, "安価で在庫処分できないかな？", "Can't we clear out stock at a fire-sale price?"),
(7, "ウェブサイトを更新していただけませんか？１週間くらいで", "Could you update our website in about a week?"),
(7, "原稿を作っていただけないでしょうか？ゼロから", "Could I ask you to make a draft from scratch?"),
(7, "皆さんにはいくら感謝してもしきれません", "I cannot thank you enough."),
(7, "危険になることがある。大量生産するのは", "It can be risky to produce on a large scale."),
(7, "返品するのは難しいかもしれません。一度開封したら", "It may be difficult to return the product once you open."),
(7, "ちょっと遅れるかもしれません。その会議に", "I might be a little late for the meeting."),
(7, "もう少しよくこの書類を見てもよろしいですか？", "May I take a closer look at the document?"),
(7, "皆さんがご自分たちのプロジェクトチームを誇りに思うのは当然です", "You may well be proud of your project team."),
(9, "我々は世界市場を視野に入れるべきです", "We should eye the global market."),
(9, "上司はもう間も無く来るはずです。", "Our boss should be here at any moment."),
(9, "一体どうして、また、期日を延期するんですか！", "How should you extend the deadline again!"),
(9, "そのマーケティング戦略について簡単な説明をしましょうか。", "Shall I give you a brief description of the marketing strategy."),
(9, "時間もなくなってきていますので、次の議題に移りましょう。", "We are almost running out of the time, so shall we move on to the next agenda?"),
(9, "あと１時間でこの仕事を終わらせなきゃならない！", "I must get this work done in an hour!"),
(9, "我々は来週までに新支社の建設請負人を見つけざるを得ません。", "We have to find a contractor of the constraction for the new branch by next week."),
(9, "我々は、もう、予算削減について心配する必要はありません。", "We don't have to worry about cutting down on the budget anymore."),
(9, "日本食と言えば、（絶対）お寿司を食べてみるべきです。", "you must try sushi when it comes to Japanese food."),
(9, "もう少し臨機応変にした方が良いのではないかと思います。", "I should say you ought to be a little more tactful."),
(14, "その契約を締結するかどうかと言う事は、我社にとって大きなターニングポイントです。", "Whether to make the contract or not is a major turning point for us."),
(14, "彼らの最大の関心事は、どのようにして対外的な競争力を維持するかと言う事です。", "There biggest concern is how to remain competitive internationally."),
(14, "皆様のたゆまぬ努力が複雑な仕事を遂行することを可能にしました。", "Your untiring efforts enabled us to accomplish the complex task."),
(14, "会社は従業員にセミナーに参加するように奨励しています。", "The company encourages the employees to attend the seminars."),
(14, "我々が品質に関する良い評判を得る事は必要です。", "It is necessary for us to earn a good reputation for quality."),
(14, "我々は品質に関する良い評判を得ることが必要であると考えています。", "We think it necessary to earn a good reputation for quality."),
(14, "したくなければ、画像の保存先を選択する必要はありません。", "You don't have to specify where to save the image unless you'd like to."),
(14, "貴社との共同プロジェクトを展開する機会を得たことを光栄に思っております。", "We are honored to have this oppotunity to work with you on the project."),
(14, "率直に申し上げますと、我々は早急に新しい手を打つべきです。", "To be frank, we need to take new measures immediately."),
(14, "必要な手はずは全て整うようにしてあります。", "We are prepared to do whatever is necessary.");

insert into user_defined_contents (user_defined_lesson_id, jp_text, en_text) value
(1, "私は働きます", "I work"),
(1, "彼は毎朝6時におきます", "He get up at 6:00 every day."),
(1, "あなたは何も持っていない", "You have nothing.");