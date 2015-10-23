create type doctype as enum ('kuva','teksti');
create type docvisibility as enum ('vapaa','jäsenyys');
create type doclanguage as enum ('finnish','english','german','swedish');

create sequence publisher_id_seq;
create sequence publication_id_seq;

create table publisher (
        id int default nextval('publisher_id_seq'),
        name char(64) not null
);

create table publication (
        id int default nextval('publication_id_seq'),
        publisher int,
        name char(64),
        year int,
        volume int,
        pages int,
        type doctype,
        visibility docvisibility,
        PDF_url char(128),
        content text,
        content_indexed tsvector,
        language doclanguage
);

CREATE INDEX textsearch_idx ON publication USING gin(content_indexed);

drop table publication;
drop table publisher;
 
select * from publisher;