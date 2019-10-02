
CREATE TABLE arrangement (
  id                   int PRIMARY KEY,
  overskrift           VARCHAR,
  arrangør             VARCHAR,
  arrangert            VARCHAR,
  adresse              VARCHAR,
  postnr               VARCHAR,
  posted               VARCHAR,
  land                 VARCHAR,
  fylke                VARCHAR,
  kommune              VARCHAR,
  dato                 VARCHAR,
  start                VARCHAR,
  kart                 VARCHAR,
  mål                  VARCHAR,
  parkering            VARCHAR,
  garderobe            VARCHAR,
  etteranmeldingsgebyr VARCHAR,
  kontonummer          VARCHAR,
  påmelding            VARCHAR,
  påmelding_adresse    VARCHAR,
  påmelding_postnr     VARCHAR,
  påmelding_posted     VARCHAR,
  kvinneløp            VARCHAR,
  motbakkeløp          VARCHAR,
  nfif_lisens          VARCHAR,
  inngår_i             VARCHAR,
  link                 VARCHAR,
  underlag             VARCHAR,
  underlag_kommentar   VARCHAR,
  hjemmesider          VARCHAR,
  premier              VARCHAR,
  kommentar            VARCHAR,
  klasseinndeling      VARCHAR,
  beskrivelse          VARCHAR
  );


CREATE TABLE distance (
  id                           int PRIMARY KEY,
  arrangementId                INT,
  distanse_lengde              VARCHAR,
  distanse_starttid            VARCHAR,
  distanse_startkontingent     VARCHAR,
  distanse_fullforte_aaret_for VARCHAR,
  distanse_barnelop            VARCHAR,
  distanse_stafett             VARCHAR,
  distanse_etapper             INT,
  distanse_kontrollmålt        VARCHAR
);


CREATE TABLE kontaktperson (
  id               int PRIMARY KEY,
  arrangementId    INT,
  navn             VARCHAR,
  telefon          VARCHAR,
  mobil            VARCHAR,
  epost            VARCHAR
  );

