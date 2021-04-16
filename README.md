# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd!
Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! A `pom.xml` tartalmát nyugodtan át lehet másolni.
Projekt, könyvtár, repository neve legyen: `kepesitovizsga-gyakorlas-v5.0`.
GroupId: `training`, artifactId: `kepesitovizsga-gyakorlas-v5.0`. Csomagnév: `hu.nive.ujratervezes.kepesitovizsga`.

A feladatok megoldásához ajánlom figyelmedbe a cheat sheetet:

https://github.com/Training360/strukturavalto-java-public/blob/master/cheet-sheet/cheet-sheet.md

Először másold át magadhoz a teszteseteket, majd commitolj azonnal!

Az öt feladatra 3 órád van összesen!

Oldd meg a feladatokat, minden feladat megoldását egy külön commitban
add be!
Ha letelik az idő az első commitodhoz képest és nem fejezted be, megint commitolj, akkor is,
ha nem vagy kész! Utána nyugodtan folytathatod a megoldást, akár több órát is
ülhetsz felette, ha kész vagy, commitolj!

## Csipkerózsika betűről-betűre

A sleepingbeauty.txt fájlban találod a Csipkerózsika című mesét. A feladat az, hogy készíts belőle statisztikát:
melyik betűből hány darab található benne. Fontos, hogy csak a betűk számítanak, az egyéb karakterek nem
kellenek, valamint hogy a nagy- és kisbetűk között ne tégy különbséget! (Tehát az "A" és az "a" egy helyre számolandó.)

(A fájl az src/main/resources könyvtárban található.)

## Piroska és a farkas... és az evés

(Ez a feladat kizárólag a benne szereplő dolgok gyakorlására szolgál, és nem azért, mert egyébként bármit is
szokás lenne így csinálni. :) )

Van egy erdő (abstract class Forest), amelyben a Piroska és a farkas című mese szereplői élnek (LittleRedRidingHood,
Wolf, Grandma, Hunter). Közülük mindenkinek van neve (String name attribútum), valamint ők egy, a Forest-ben tárolt listában vannak,
mindegyikőjükből 1 példány.
Az erdőben mindenki eszik valamit (`void eat()`):
- Piroska sétálás közben megdézsmálja a nagymamának vitt süteményt (attribútum: int cake, ebből kezdetben 10 db van, Piroska minden
  egyes alkalommal 1 db-ot eszik meg ezekből).
- A nagymama (a későbbi megmenekülése után) természetesen szintén Piroska süteményeit eszi, a nagyobb ijedtség miatt egyszerre mindig 2 db-ot.
- A farkas megeszi a nagymamát és Piroskát (törlődnek a Forest-ben tárolt listából).
- A vadásznak evés előtt fontos dolgai vannak: az `eat()` meghívásakor előbb meg kell ölnie a farkast (a farkas ekkor törlődik
  az erdei listából), majd ki kell vennie a hasából a nagymamát és Piroskát (ők ekkor újra a listához fognak tartozni, idősebbeké
  az elsőbbség!), és a vadász csak ezután vehet a Piroska által hozott süteményből (a még nagyobb ijedtség okán egyszerre 3 db-ot).
Amire mindenképpen figyelj: fontos, hogy hogyan hozod létre a Forest osztályban tárolt listát, mivel később törölni kell majd belőle. 
A másik, hogy ebben a feladatban most többször kell majd a static módosítószót és az equals() metódust is használnod.
  
## Hamupipőke szavai

Egy Object tömbben add vissza, hogy a Hamupipőke meséből a következő szavak közül melyik szerepel a legtöbbször,
és hogy pontosan hányszor is fordul elő: Hamupipőke, galamb, királyfi, mostoha, cipő (a sorrend fontos!)
A megvalósítás lépései a következők: 
- a Cinderella osztálynak legyen egy int[] attribútuma, melynek elemeiben számolhatod ezeknek a szavaknak az előfordulásait.
- olvasd be a mesét fájlból (src/main/resources/cinderella/cinderella.txt), és közben számolj az int tömbben! Figyelj arra,
  hogy ne pontos egyezést vizsgálj, hanem tartalmazást! (Tehát pl. a "királyfi" szó előfordulásaiba számítson bele
  a "királyfi", "Királyfi", "királyfié", "királyfival", stb., de pl. a Hamupipőke előfordulásaiba ne számítson bele
  a "Hamupipőkével", mert az nem pontosan az eredeti szót tartalmazza.)
- végül legyen egy metódus, amely visszaadja a korábban már említett Object tömböt!

(A feladatba azért írtam tömböket, mert a szerdai konzultáción arról volt szó, hogy lesz a vizsgán. :) )

## Hófehérke hét törpéje

Hozz létre egy Dwarf osztályt, attribútumai: String name és int age.
Majd hozz létre egy SnowWhite osztályt, amely tárol és kezel egy listát a hét törpéről! Ebben az osztályban
három metódust valósíts meg:
- `getSevenDwarfs()` : visszaadja az osztály által tárolt listát.
- `getSevenDwarfsOrderedByNames()` : visszaadja az osztály által tárolt listát úgy, hogy abban a törpék név szerinti sorrendben szerepelnek.
- `getSevenDwarfsOrderedByAges()` : visszaadja az osztály által tárolt listát úgy, hogy abban a törpék életkor szerinti sorrendben szerepelnek.

## Keresd a Békakirályfit!

Először írj egy PlayerOfTale osztályt, amely egy meseszereplőt fog reprezentálni. Attribútumai: String name, int age
és Tale tale (ez utóbbi egy enum, a következő példányokkal: CINDERELLA, FROGPRINCE, LITTLEREDRIDINGHOOD, SLEEPINGBEAUTY, SNOWWHITE)!
Ezután a FrogPrince osztályba írj egy `getPlayersOfTale(DataSource dataSource, Tale tale)` metódust, amely egy adatszerkezetben
visszaadja a paraméterként kapott mese összes szereplőjét. Ezeket természetesen a megadott DataSource segítségével olvassa
ki az adatbázisból.

(A teszteléshez szükséges fájl: src/main/resources/db/migration/V1__tales.sql)