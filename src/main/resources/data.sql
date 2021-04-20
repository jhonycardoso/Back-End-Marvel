--CHARACTERS
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION) VALUES (1, 'SPIDER-MAN', 'SPIDER-MAN');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION) VALUES (2, 'HULK', 'HULK');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION) VALUES (3, 'WOLVERINE', 'WOLVERINE');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION) VALUES (4, 'CAPTAIN-AMERICA', 'CAPTAIN-AMERICA');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION) VALUES (5, 'IRON-MAN', 'IRON-MAN');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION) VALUES (6, 'THOR', 'THOR');
INSERT INTO CHARACTER (ID, NAME, DESCRIPTION) VALUES (7, 'BLACK-WIDOW', 'BLACK-WIDOW');

--COMICS
INSERT INTO COMIC (ID, DATE, DESCRIPTION, TITLE) VALUES (1, TO_DATE('MM-DD-YYYY', '06-01-2006'), 'CIVIL WAR - FIRST CHAPTER', 'CIVIL WAR - FIRST CHAPTER');
INSERT INTO COMIC (ID, DATE, DESCRIPTION, TITLE) VALUES (2, TO_DATE('MM-DD-YYYY', '01-31-2007'), 'CIVIL WAR - LAST CHAPTER', 'CIVIL WAR - LAST CHAPTER');
INSERT INTO COMIC (ID, DATE, DESCRIPTION, TITLE) VALUES (3, TO_DATE('MM-DD-YYYY', '10-01-1994'), 'THE REAL CLONE SAGA', 'THE REAL CLONE SAGA');
INSERT INTO COMIC (ID, DATE, DESCRIPTION, TITLE) VALUES (4, TO_DATE('MM-DD-YYYY', '04-01-2012'), 'AVENGERS VS X-MEN', 'AVENGERS VS X-MEN');
--CHARACTERS - COMICS
INSERT INTO CHARACTER_COMIC VALUES (5, 1);
INSERT INTO CHARACTER_COMIC VALUES (7, 1);
INSERT INTO CHARACTER_COMIC VALUES (4, 1);
INSERT INTO CHARACTER_COMIC VALUES (5, 2);
INSERT INTO CHARACTER_COMIC VALUES (7, 2);
INSERT INTO CHARACTER_COMIC VALUES (4, 2);
INSERT INTO CHARACTER_COMIC VALUES (1, 3);
INSERT INTO CHARACTER_COMIC VALUES (3, 4);
INSERT INTO CHARACTER_COMIC VALUES (4, 4);
INSERT INTO CHARACTER_COMIC VALUES (5, 4);

--EVENTS
INSERT INTO EVENT (ID, TITLE, DESCRIPTION, START_DATE, END_DATE) VALUES (1, 'CIVIL WAR', 'CIVIL WAR', TO_DATE('MM-DD-YYYY', '06-01-2006'), TO_DATE('MM-DD-YYYY', '01-31-2007'));
INSERT INTO EVENT (ID, TITLE, DESCRIPTION, START_DATE, END_DATE) VALUES (2, 'AVENGERS VS X-MEN', 'AVENGERS VS X-MEN', TO_DATE('MM-DD-YYYY', '04-01-2012'), TO_DATE('MM-DD-YYYY', '10-31-2012'));
--CHARACTERS - EVENTS
INSERT INTO CHARACTER_EVENT VALUES (5, 1);
INSERT INTO CHARACTER_EVENT VALUES (7, 1);
INSERT INTO CHARACTER_EVENT VALUES (4, 1);
INSERT INTO CHARACTER_EVENT VALUES (3, 2);
INSERT INTO CHARACTER_EVENT VALUES (4, 2);
INSERT INTO CHARACTER_EVENT VALUES (5, 2);

--SERIE
INSERT INTO SERIE (ID, TITLE, DESCRIPTION, START_DATE, END_DATE) VALUES (1, 'CIVIL WAR - SERIE ', 'CIVIL WAR - SERIE', TO_DATE('MM-DD-YYYY', '06-01-2006'), TO_DATE('MM-DD-YYYY', '01-31-2007'));
INSERT INTO SERIE (ID, TITLE, DESCRIPTION, START_DATE, END_DATE) VALUES (2, 'AVENGERS VS X-MEN - SERIE', 'AVENGERS VS X-MEN - SERIE', TO_DATE('MM-DD-YYYY', '04-01-2012'), TO_DATE('MM-DD-YYYY', '10-31-2012'));
--CHARACTERS - SERIE
INSERT INTO CHARACTER_SERIE VALUES (5, 1);
INSERT INTO CHARACTER_SERIE VALUES (7, 1);
INSERT INTO CHARACTER_SERIE VALUES (4, 1);
INSERT INTO CHARACTER_SERIE VALUES (3, 2);
INSERT INTO CHARACTER_SERIE VALUES (4, 2);
INSERT INTO CHARACTER_SERIE VALUES (5, 2);

--STORIE
INSERT INTO STORIE (ID, NAME, DESCRIPTION) VALUES (1, 'CIVIL WAR - STORIE', 'CIVIL WAR - STORIE');
INSERT INTO STORIE (ID, NAME, DESCRIPTION) VALUES (2, 'AVENGERS VS X-MEN - STORIE', 'AVENGERS VS X-MEN - STORIE');
--CHARACTERS - STORIE
INSERT INTO CHARACTER_STORIE VALUES (5, 1);
INSERT INTO CHARACTER_STORIE VALUES (7, 1);
INSERT INTO CHARACTER_STORIE VALUES (4, 1);
INSERT INTO CHARACTER_STORIE VALUES (3, 2);
INSERT INTO CHARACTER_STORIE VALUES (4, 2);
INSERT INTO CHARACTER_STORIE VALUES (5, 2);

COMMIT;

