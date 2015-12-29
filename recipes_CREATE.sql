create table Ingredient (id int8 not null, name varchar(255) not null, primary key (id))
create table Recipe (id int8 not null, add_date date, duration date, name varchar(255) not null, prepare_desc varchar(255) not null, primary key (id))
create table meal_type (id int8 not null, name varchar(255) not null, primary key (id))
create table recipe_ingredient (ingredient_amount varchar(255) not null, recipe_id int8, ingredient_id int8, primary key (ingredient_id, recipe_id))
alter table meal_type add constraint UK_e6njwdehrkb3asj5wjgw78cfa  unique (name)
alter table Recipe add constraint FK_l4krtn51clx6n805racc17fep foreign key (id) references meal_type
alter table recipe_ingredient add constraint FK_thghmqhlim0p7i6auo6kfmxwo foreign key (recipe_id) references Recipe
alter table recipe_ingredient add constraint FK_tmcdw7h1sgbnmr3tab1ccbb49 foreign key (ingredient_id) references Ingredient
create sequence hibernate_sequence
create sequence mealtype_seq
