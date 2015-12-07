# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ingredient (
  id                        bigserial not null,
  name                      varchar(255),
  constraint pk_ingredient primary key (id))
;

create table recipe (
  id                        bigserial not null,
  description               varchar(255),
  add_date                  date,
  constraint pk_recipe primary key (id))
;

create table recipes_ingredients (
  recipe_id                 integer,
  ingredient_id             integer,
  amount                    varchar(255),
  constraint pk_recipes_ingredients primary key (recipe_id, ingredient_id))
;

alter table recipes_ingredients add constraint fk_recipes_ingredients_recipe_1 foreign key (recipe_id) references recipe (id);
create index ix_recipes_ingredients_recipe_1 on recipes_ingredients (recipe_id);
alter table recipes_ingredients add constraint fk_recipes_ingredients_ingredi_2 foreign key (ingredient_id) references ingredient (id);
create index ix_recipes_ingredients_ingredi_2 on recipes_ingredients (ingredient_id);



# --- !Downs

drop table if exists ingredient cascade;

drop table if exists recipe cascade;

drop table if exists recipes_ingredients cascade;

