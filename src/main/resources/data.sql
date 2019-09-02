insert into WHIPROUND (id,goal,description) values (nextval('whip_seq'), 1000, 'samochod');
insert into WHIPROUND (id,goal,description) values (nextval('whip_seq'), 70000, 'wklad wlasny');

insert INTO DONATION (id, whipround_id, amount, first_name, last_name, email) values (nextval('donat_seq'), 1, 1, 'Damian' , 'Lukaszewski', 'farmer127@wp.pl');

commit;