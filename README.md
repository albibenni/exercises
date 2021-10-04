# exercises
Esercizio Scrivere un programma che richiesto un numero intero visualizzi tutti i suoi divisori, contandoli.

Esercizio Calcola i numeri primi compresi tra due numeri interi inseriti dall'utente.

Esercizio Inserire una serie di numeri interi positivi da tastiera ed individuare il massimo e il minimo; la serie in ingresso deve essere terminata dal numero 0.

Esercizio Scrivere un programma che inseriti i lati di un ipotetico triangolo, dica se tale triangolo esiste.(un triangolo è fattibile se ogni lato è minore della somma degli altri due)

Esercizio Scrivere un programma che dato un numero, restituisca il suo fattoriale.

Esercizio La serie di Fibonacci è una successione di interi in cui i primi 2 elementi sono 1 e tutti i successivi sono uguali alla somma dei due termini precedenti.

Sequenza di Fibonacci : 1,1,2,3,5,6,13,21,34,55,89,144,233,...

La serie di Fibonacci ha una definizione ricorsiva definita come segue

Input n = 1 then risultato = 1
Input n = 2 then risultato = 1
Input n = Intero >= 3 then risultato = Funzione fibonacci Fn-1 + Fn-2
Implementare un progetto che, tramite ricorsività e un numero in input definito dall'utente da console (utilizzare lo Scanner), stampi la relativa serie di Fibonacci.

Esercizio Scrivere il programma del fattoriale con un metodo ricorsivo.

Esercizio Realizza un programma che sia in grado di valutare il volume di oggetti tridimensionali come cilindri e parallelepipedi basandosi sul valore della loro area e dell'altezza. Delegare i metodi comuni, come il calcolo e la stampa del volume ad una classe astratta.

Esercizio Scrivi un programma che simuli il lancio di un dado e di una moneta stampandone il risultato; con e senza l'utilizzo di una classe astratta che rappresenti i comportamenti comuni degli oggetti dado e moneta istanziati.

Esercizio Scrivi un programma che sia in grado di istanziare degli oggetti 'distributori di benzina' di cui sia nota la città, il proprietario, la capacità e la benzina attualmente contenuta nel distributore. Dell'oggetto Distributore, deve essere possibile simulare le operazioni di erogazione del carburante e dei corrispondenti incassi. Implementa una interfaccia Comparable, in modo da consentire il confronto tra 2 distributori in base alla capacità del serbatoio di carburante.

Esercizio Definisci una interfaccia 'operazione' e le sue classi derivate( sub. div, mul) in modo che da ciascuna sia possibile eseguire la corrispondente operazione aritmetica (di addizione, divisione, moltiplicazione) istanziando un oggetto di classe 'operazione' e due operandi. Realizzare anche, una classe astratta che implementi le funzionalità comuni come la stampa a video del risultato.

Esercizio In un'aerodromo si vuol mantenere informazioni sugli aeromobili. Di ogni aeromobile si vuole sapere la sigla (string) che lo identifica. Gli alianti sono aeromobili caratterizzati da un numero (int) che ne descrive l'efficienza aereodinamica. Degli aerei a motore si vuole sapere la potenza in CV del motopropulsore (double).

Aeromobili dello stesso tipo devono essere confrontabili fra loro in modo da poter stabilire quale sia quello con prestazioni migliori. Gli alianti si confrontano in base all'efficienza; gli aerei a motore in base alla potenza in CV.

Scrivi un'interfaccia pubblica CMP contenente un metodo boolean superiore (CMP x) per verificare se un aeromibile (this) è superione adun altro x come prestazioni. Il metodo deve sempre restituire false se x=null o se gli oggetti coinvolti nel confronto non sono dello stesso tipo.

Scrivi tre classi pubbliche: aeromobile (A) aliante (AL) ed aereomotore (AM) ciascuna con un metodo get pubblico per accedere all'attributo specifico della classe. Ogni classe deve fornire anche:un costruttore, i metodi equals e toString. Il codice scritto deve rispettare i seguenti vincoli: ° La classe aeromobile (A) deve implementare l'interfaccia CMP. ° Aliante (AL) ed aereomotore (AM) devono estendere aeromobile (A). ° Deve esserci almeno una classe astratta.

Esercizio Realizza una opportuna gerarchia di classi per modellare una collezione (C) identificata da un nome, da un luogo, da un insieme di opere d'arte e dalle informazioni relative al loro ingombro. Radice della gerarchia è la classe astratta operadarte (OD) contenente : — i campi protetti titolo artista — il costruttore — il metodo public abstract double printingombro() che restituisce l'ingombro dell'opera — il metodo public boolean equals(Object o) che verifica se due opere d'arte sono uguali ed altri metodi di interesse. La sottoclasse quadro (Q) ha due variabili aggiuntive:altezza e larghezza che identificano la misura del quadro. La sottoclasse scultura (S) ha 3 variabili aggiuntive altezza larghezza e profondità che identificano le misure della scultura. Implementare le due classi concretizzando il metodo ingombro(). Realizzare poi, una classe collezione identificata da un nome e da un insieme di opere d'arte scrivere i seguenti metodi: inserire un opera d'arte, stampare la collezione , stampare l'occupazione di una data opera .

Esercizio

Realizza un programma che ricevuto in ingresso un numero del sistema numerico decimale lo trasformi in binario, rappresentandone la forma in complemento a uno e in complemento a due .
Realizza una pila (di lunghezza indefinita) tramite l'utilizzo della classe ArrayList .
Realizzare una coda con priorità tramite la classe ArrayList .
Esercizio Scrivere un programma per la gestione di un acquario costituito da due vasche identificabili da un nome. In ogni vasca sono contenuti un certo numero di esemplari. Ogni esemplare è qualificato da un identificativo alfanumerico e dall'età. Un esemplare può essere un pesce oppure un mammifero. Nel caso di un pesce l'unico attributo di interesse è la profondità; nel caso di un mammifero è il periodo di gestazione. Deve essere possibile: ° inserire un nuovo esemplare in una specifica vasca ° stampare gli esemplari presenti nelle vasce ° eliminare un certo esemplare .

Esercizio Scrivi un programma in grado di gestire le ordinazioni ai tavoli di un ristorante. Nel ristorante possono essere disposti dei tavoli, ciascuno qualificato da un id numerico e da un numero di coperti. Per ciascun tavolo devono essere memorizzate le bevande ed i piatti consumati, in automatico deve poter essere calcolato il conto da pagare. I piatti e le bevande disponibili, sono invece memorizzati in una classe 'Menu' che li suddivide in due categorie (piatti e bevande, appunto). Ogni piatto o bevanda deve essere qualificato da un identificatore univoco alfanumerico (nome) e dal suo prezzo.

Esercizio Crea un programma per la gestione di un controcorrente gestito dalla classe CC. Il programma deve essere in grado di effettuare versamenti, prelievi, di restituire il saldo e di effettuare la lista degli ultimi 5 movimenti .

Esercizio Scrivi una classe T che contenga un orario valido. Deve essere possibile impostare un orario in ore,minuti,secondi; la classe deve prevedere un metodo per la validazione di un orario, un metodo per aggiungere un orario ad un altro e un metodo per sottrarre due orari .

Esercizio Definisci una classe Parallelogramma (P) con i seguenti attributi: diagonale maggiore (D) diagonale minore (d) e angolo (p) che la diagonale maggiore forma rispetto l'orizzontale. Deve essere possibile calcolare, i lati, l'area e perimetro del parallelogramma. Costruisci, quindi la classe Rombo [R] estendendo la precedente e Quadrato (Q) estendendo Rombo .

Esercizio E' necessario scrivere una applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di telefonia cellulare. Si devono quindi rappresentare i dati relativi ad una carta SIM ed in particolare: ° il numero di telefono ° il credito disponibile in euro ° la lista delle telefonate effettuate Per ciascuna telefonata deve essere rappresentata la durata in minuti La classe SIM dovrà fornire le seguenti funzionalità: ° un costruttore parametrizzato che crea una SIM con numero di telefono, un credito e la lista delle telefonate vuota ° un metodo per l'inserimento di una telefonata con i dati forniti dall'utente. ° una funzione per il calcolo dei minuti totali di conversazione. ° una funzione per il calcolo delle telefonate effettuate verso un certo numero ° una procedura per la stampa dei dati della SIM e l'elenco delle telefonate.

GESTIONALE DIPENDENTI
enum DIPENDENTI_CONTRATTO_INDETERMINATO DIPENDENTE_1 (nome.cognome, nome, cognome, stipendioBase), DIPENDENTE_2 (nome.cognome, nome, cognome, stipendioBase), DIPENDENTE_3 (nome.cognome, nome, cognome, stipendioBase), DIPENDENTE_4 (nome.cognome, nome, cognome, stipendioBase), DIPENDENTE_5 (nome.cognome, nome, cognome, stipendioBase),

classe wrapper gestioneUtenti
contiene lista dipendenti

alla creazione della classe vengono caricati 5 dipendenti andando a prende i valori base dall'enum DIPENDENTI_CONTRATTO_INDETERMINATO

aggiungere un dipendente alla lista

rimuove dipendente dalla lista (controllo id, username)

per ogni dipendente caricato, inserisco la mappa premi bonusmalus, una mappa mese/bonusmalus

creare un enum EMesi... GENNAIO, FEBBRAIO, ecc...

creare una mappa <EMese, List> da associare a ciascun dipenente

poter recuperare il dipendente migliore di Natale (ha lo stipendio netto, base + somma bonus)

poter recuperare il dipendente che nell'anno ha più malus

verficare se il dipendente con più malus annuali è anche il dipendente con stipendio totale più basso (base + bonusmalus)

FILE LETTURA
letttura di un file contenente un dizionario in ordine alfabetico
memorizzazione dei dati in struttura dati, in una set e in una sorted set.
eseguire dei test di recupero di una stessa parola nei 2 dizionari mappa.
chi è più veloce?
FILE SCRITTURA
usare le libreria di java 8 creare un file di testo, vetture.txt per cui ogni riga del file è composta da targa|marca|nome_proprietario usare il simbolo | come separatore.

Il programma attraverso del funzioni di utilità deve essere in grado di

creare vetture in modo randomico

creare randomicamente le targhe (del tipo XC45FR, quindi 2 caratteri maiuscoli, seguiti da 2 cifre da 0 a 9 e altri 2 caratteri maiuscoli.
le targhe devono essere univoche (eseguire un controllo prima di scrivere su file, in caso di collisione lanciare una eccezione custom, VehicleDuplicationException
la marca deve essere presa, randomicamente da un enum FIAT, ALFA_ROMEO, TOYOTA, FERRARI, FORD, BMW
i nominativi devono essere presi da un array statico definito da qualche parte, che contiene le stringhe (nome e cognome in un unico attributo). (creare 30 persone, vanno bene anche supereroi, minny e paperino)
creare 30 vetture, ogni proprietario possiede una sola vettura.

creare il file con la struttura prevista.

se il programma viene eseguito più volte, verificare la presenza del file precedente, cancellarlo e sostituirlo.

Se trovate buchi di analisi vedetele come libertà implementative, sfruttatele per creare un programma utilizzando le strutture che più preferite, ma portate a casa il risultato. Il file si dovrà trovare in un percorso su disco specifico, che indicherete voi.

GESTIONALE PARCHEGGIO
Esistono 3 parcheggi. ParkFree -> ParkPay -> LuxuryPark Ogni Parcheggio ha le proprietà :

nome,
indirizzo,
costo in euro del posteggio al giorno,
il numero di posti totale,
una lista di Auto che sono presenti nel parcheggio. Il numero massimo della lista corrisponde al numero di posti totale del parcheggio.
Caratteristiche dei parcheggi: ParkFree avrà una lista limitata di 5 posti auto, costo 0 euro a posteggio. ParkPay e una lista di 10 posteggi auto, costo di 5.5 euro a posteggio. LuxuryPark avrà 1000 posti, costo di 16.75 euro a posteggio.

TODO:

leggere il file vetture.txt creato in precedenza.

Ogni riga del file contiene gli attributi di Auto, targa, marca e proprietario.

Memorizzare le vetture in una struttura dati opportuna. ( "loadedCars" )

creare un manager in grado di gestire tutti i parcheggi, all'ininzializzazione del manager, creare i 3 parcheggi.

una volta creati i 3 parcheggi, avere la possibilità di caricare le prime 20 vetture di "loadedCars", in modo randomico, nei parcheggi ParkFree e ParkPay e Luxury.

oltre all'inserimento randomico sono necessarie delle regole aggiuntive, se il parcheggio ParkFree è pieno, le auto andranno nel ParkPay, se anche questo è pieno i proprietari dovranno parcheggiare nel LuxuryPark (sempre disponibile).

ogni volta che un'auto viene presa da "loadedCars" deve essere registrato il fatto che le vetture sono state parcheggiate.

un'auto non può essere presente più volte nello stesso parcheggio.

un'auto può essere presente in un solo parcheggio alla volta.

dopo il caricamento verificare che "loadedCars" ha ancora 10 vetture non parcheggiate

stampare elenco delle vetture non parcheggiate.

ogni parcheggio deve avere un metodo per verificare il numero di posti occupati.

ogni parcheggio deve avere un metodo per verificare il numero di posti liberi.

ogni parcheggio deve avere un metodo per verificare se c'è almeno un posto disponibile o se è pieno.

dato un parcheggio, stampare tutte le vetture, il numero di posti massimo e il numero di posti occupati.

avere un metodo per ricercare un veicolo e sapere in quale parcheggio si trova (se non è in nessun parcheggio deve essere in "loadedCars")

creare un metodo per liberare un posto in un parcheggio fornendo il nome del parcheggio e la targa del veicolo. ( il veicolo deve ritornare in "loadedCars" come non parcheggiata)

dal main verificare se il parcheggio ParkPay è pieno o meno. Se non è pieno riempirlo con le vetture rimanenti in "loadedCars".

rimuovere 3 vetture dal parcheggio ParkPay.

stampare il numero di vetture presenti nel parcheggio ParkPay (7), calcolare l'incasso del parcheggio (verificare se corretto 7*5.5euro) e stampare i nominativi dei proprietari e il costo pagato.

anche in questo caso, se trovate buchi di specifiche vedetele come libertà implementative, sfruttatele per creare un programma utilizzando le strutture che più preferite ma soddisfino tutti i requisiti.

FEISBUK
impratichirsi con la possibilità di avere un'interfaccia input/output public static void main(String[] argv) { int i, j; Scanner scanner = new Scanner(System.in); try { System.out.print("Primo numero: "); i = scanner.nextInt(); System.out.print("Secondo numero: "); j = scanner.nextInt(); System.out.println(i + j); } catch(InputMismatchException ex) { System.out.println("Errore, input non valido."); } finally { scanner.close(); } }

Implementare un progetto che abbia delle funzionalità simili ad un social network. Sono presenti , Utenti con la possibilità di avere amici, Foto e Amici taggati alle foto. Ogni utente ha un nome, cognome, username (univoco), luogo di nascita e data di nascita. Una foto ha un id univoco di tipo stringa, nome, luogo in cui è stata scattata, data e ora dello scatto, EVENTUALE elenco di persone taggate ( compreso il proprietario )

Sfruttando il menu di opzioni per le operazioni, avere la possibilità di - creare un nuovo utente, aggiungendolo alla lista di utenti di FEISBUK. - aggiungere amici ad un utente ( passando lo username dell'utente, e lo username dell'amico) - stampare il dettaglio di un utente - stampare l'elenco degli amici di un utente - aggiungere una foto ad un utente - stampare l'elenco delle foto di un utente (nome, data e ora, luogo scatto) - dato lo username utente, l'id di una sua foto, e lo username di un amico , è possibile taggare l'amico nella foto. - dato lo username utente, l'id di una foto, stampare l'elenco di amici

Iniziate con la gestione utente e gestione amici, la parte delle foto possiamo farla in un secondo momento. Il menu deve avere una specifica operazione per poter uscire e terminare il programma Nel caso di errori( id foto non trovato, utente non trovato ecc..) gestire l'eccezione e ritornare un messaggio di errore comprensibile e stamparlo a video.

GESTIONALE CONTO CORRENTE
GESTIONALE ORDINI E ARTICOLI
GESTIONALE LIBRERIA
FABBRICA VEICOLI
Implementare un progetto che simuli una fabbrica di veicoli che produce 4 tipi di veicoli diversi (auto, modo, camion barche).

Ogni veicolo avrà n pezzi (ad esempio 4 ruote, due/quattro sportelli ecc.). Inventare fino ad un massimo di 5 pezzi per veicolo
Ogni veicolo sarà prodotto in una specifica catena di montaggio
Ogni catena di montaggio sarà composta da un robot per ogni pezzo del veicolo, che si occuperà di recuperare il pezzo da un cestino piazzato in prossimità.
Simulare attraverso un main la costruzione di uno o più veicoli dati in input.
Lo scopo dell'esercizio è quello di comprendere bene come strutturare una gerarchia di classi, generalizzare ove possibile (classi generiche) e strutture dati come liste, mappe e code.

ALGORIMO DI BERGER
L'algoritmo di BERGER serve per definire un calendario (diviso in giornate) di un torneo sportivo con il sistema del "girone all'italiana";

Seguono i vincoli necessari per l'implementazione dell'algoritmo :

Con un numero pari di squadre partecipanti, l'algoritmo calcola "N:2" accoppiamenti per ogni giornata (con N = N-1)
Per ogni giornata «g» compresa tra 1 e «n−1»;
Per ogni incontro «i» compreso tra 1 e «n:2»;
L'incontro «i» abbina due squadre in base a questi criteri: non sono state ancora abbinate
le restanti squadre - non selezionate - non siano state a loro volta già accoppiate.
Implementare l'algoritmo con input l'array di squadre partecipanti. (Durante l'implementazioni utilizzare l'interfaccia Stream per la gestione dei flussi dati)

Esercizio Crea un programma dotato di una classe 'potenza' che implementa la potenza del 2 dei numeri (interi) associati agli oggetti istanziati della classe . La classe deve essere dotata di costruttore, di un metodo pow() che stampi a video la potenza del numero associato all'oggetto, e di un metodo cambiobase() che deve permettere di cambiare base alla potenza da calcolare.

Esercizio Crea un programma per la gestione di un controcorrente gestito dalla classe CC. Il programma deve essere in grado di effettuare versamenti, prelievi, di restituire il saldo e di effettuare la lista degli ultimi 5 movimenti .

Esercizio Realizza un programma per gestire una pila di interi di max 5 elementi attraverso una classe pila che deve prevedere dei metodi per l'inserimento e per l'estrazione di un elemento.

Esercizio Realizza un programma per gestire una coda di interi di max 5 elementi attraverso una classe Coda che deve prevedere dei metodi per l'inserimento e per l'estrazione di un elemento.

Esercizio Scrivi una classe T che contenga un orario valido. Deve essere possibile impostare un orario in ore,minuti,secondi; la classe deve prevedere un metodo per la validazione di un orario, un metodo per aggiungere un orario ad un altro e un metodo per sottrarre due orari .

Esercizio Scrivi una classe che dati due numeri complessi in ingresso, sia in grado di stampare in output la loro somma, la loro differenza, il loro prodotto e il loro rapporto.

Esercizio Definisci una classe Parallelogramma (P) con i seguenti attributi: diagonale maggiore (D) diagonale minore (d) e angolo (p) che la diagonale maggiore forma rispetto l'orizzontale. Deve essere possibile calcolare, i lati, l'area e perimetro del parallelogramma. Costruisci, quindi la classe Rombo [R] estendendo la precedente e Quadrato (Q) estendendo Rombo .

Esercizio E' necessario scrivere una applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di telefonia cellulare. Si devono quindi rappresentare i dati relativi ad una carta SIM ed in particolare:

il numero di telefono
il credito disponibile in euro
la lista delle telefonate effettuate Per ciascuna telefonata deve essere rappresentata la durata in minuti La classe SIM dovrà fornire le seguenti funzionalità:
un costruttore parametrizzato che crea una SIM con numero di telefono, un credito e la lista delle telefonate vuota
un metodo per l'inserimento di una telefonata con i dati forniti dall'utente.
una funzione per il calcolo dei minuti totali di conversazione.
una funzione per il calcolo delle telefonate effettuate verso un certo numero
una procedura per la stampa dei dati della SIM e l'elenco delle telefonate.
Scrivere una classe Libro che rappresenti le seguenti informazioni relative ad un libro: titolo, autore, prezzo, e che contenga il costruttore parametrizzato ed i metodi geTitolo, getAutore e getPrezzo che restituiscono rispettivamente il titolo, l'autore e il prezzo del libro. Scrivere poi una classe Libreria, che rappresenti un insieme di libri tramite un array di tipo Libro, e che contenga il costruttore parametrizzato ed un metodo trova che accetta in ingresso un autore a e intero k e restituisce il numero di libri contenuti nella libreria aventi autore a e prezzo superiore a k. Aggiungere alla classe Libreria un metodo che accetti un autore a e restituisca i titoli di tutti i libri scritti dall’autore a.

SQL
SOCIAL NETWORK
Progettare base dati per un social network con queste caratteristiche: Ogni utente ha un nome, cognome, username (univoco), luogo di nascita e data di nascita, foto profilo. Un utente ha la possibilità di avere 0 o n amici. Un utente ha la possibilità pubblicare 0 o n foto. Una foto ha un id univoco di tipo stringa, nome, luogo in cui è stata scattata, data e ora dello scatto.
Un utente può avere Foto e Amici taggati alle foto, EVENTUALE elenco di persone taggate.

MOVIES
Si vuole progettare una base di dati per gestire informazioni su Attori, Registi, Film e Proiezioni. Attori e registi sono identificati dal nome; di essi interessa la nazionalità e l’anno di nascita. I film sono identificati da un codice; di essi interessa il titolo, l’anno di produzione, il regista, gli attori che vi recitano e, per ogni attore, se è protagonista o non protagonista. Di una proiezione interessa la città, la sala, la data, l’ora, il numero di spettatori.

LIBRERIA
Una libreria vuole gestire le informazioni relative al catalogo dei libri, ai clienti, agli ordini ed ai fornitori. Il Catalogo contiene le descrizioni bibliografiche (Titolo, Autori, Casa Editrice, Anno di Edizione). Ogni descrizione bibliografica è identificata da un codice unico (ISBN o altro). Non tutti i libri descritti nel catalogo sono disponibili in libreria; di quelli disponibili interessa il numero di copie presenti ed il prezzo di vendita. Per alcuni libri è in corso un ordine; di tali ordini, identificati da un codice, interessa la data di emissione, il fornitore a cui l’ordine è rivolto ed il numero di copie ordinate di ciascun libro (un ordine può naturalmente riferirsi a più libri). I fornitori sono identificati dal Codice Fiscale; di essi interessa anche la Partita IVA, il Nome, l’ indirizzo.

OSPEDALE
Si considerino i seguenti fatti, di interesse di un ospedale: Reparti: un reparto e' identificato da un codice; di ogni reparto interessa il nome, i medici operanti nel reparto, i pazienti ricoverati, il direttore. Pazienti: un paziente e'identificato da un numero; di ogni paziente interessa il nome, il sesso, il reparto in cui e'ricoverato, la data di ricovero Medici: un medico e'identificato dal codice fiscale; di ciascun medico interessa il nome, la specializzazione, il reparto di appartenenza

NOLEGGIO AUTO
Una agenzia di noleggio di autovetture ha un parco macchine ognuna delle quali ha una targa, un colore e fa parte di una categoria; per ogni categoria c’è una tariffa di noleggio

MUSEI
Si vuole progettare una base di dati per gestire informazioni su musei, le opere che conservano, gli artisti che hanno creato tali opere. Di un museo interessano il nome, che lo identifica, la città, l’indirizzo e il nome del direttore. Un artista è identificato dal nome; di lui interessano la nazionalità, la data di nascita, la eventuale data di morte. Di un’opera, identificata da un codice, interessano, l’anno di creazione e il titolo, il nome dei personaggi rappresentati. Un’opera può essere un dipinto od una scultura; se è un dipinto interessano il tipo di pittura e le dimensioni; se è una scultura interessano il materiale, l’altezza ed il peso.

FARMACIA
Si vuole rappresentare una base dati per la gestione dei prodotti disponibili in una farmacia tenendo conto delle seguenti informazioni. • Ciascun prodotto è caratterizzato univocamente dal nome del prodotto stesso e dall’informazione relativa alla ditta fornitrice del prodotto. • I prodotti presenti nella farmacia possono essere medicinali oppure prodotti di profumeria. • Per ciascun prodotto è noto l’elenco degli usi possibili del prodotto stesso (ad esempio malattie da raffreddamento, dolori alle ossa, oppure detergente per il viso o per il corpo). • Della ditta fornitrice sono invece noti un recapito, il nome, utilizzato per identificare la ditta stessa, ed eventualmente il numero di fax se disponibile. • Nel caso dei medicinali, la base dati contiene l’informazione relativa al fatto che un medicinale sia mutuabile o no, e se la vendita sia effettuabile solo se viene presentata una ricetta medica. • Inoltre è nota la categoria farmacoterapeutica di appartenenza del medicinale (ad esempio antibiotico, oppure anti-infiammatorio)

• I medicinali sono contenuti in cassetti, contenuti a loro volta in scaffali. • Gli scaffali sono identificati da un codice numerico univoco per ciascuna categoria farmacoterapeutica ed i cassetti da un codice numerico univoco per ciascuno scaffale.

• Nel caso infine di medicinali che richiedano la ricetta medica, si vuole tener traccia di ogni vendita effettuata per quel medicinale, indicando il giorno, la quantit`a ed il nome del medico che ha fatto la prescrizione.
