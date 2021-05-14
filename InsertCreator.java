import java.util.Scanner;

public class InsertCreator {
    static String[] nombres;
    static String[] apellidos;
    static String[] direcciones;
    static String[] categorias;
    static String[] valoracion= {"muy mala", "mala", "indiferente", "buena", "muy buena", "no valorada"};
    static String[] publico= {"niños pequeños", "adolescentes", "adultos", "ancianos"};
    static String[] tamaño= {"corto","medio","largo"};
    static String[] revistas;
    //insert into empresa values ('Marietes_Madrid', 'Avenida Madrid', '100',  '610318921', '990005456' );
    public InsertCreator(){
         GetNames();
         GetPreNames();
         GetDir();
         GetCat();
         GetRevistas();
    }

    public void GetNames(){
        StringBuilder listNames = new StringBuilder("Aarón Ander Joaquín\n" +
                "            Abel Andrés Joel\n" +
                "            Abelardo Ángel Jon\n" +
                "            Abraham Aníbal Jordi\n" +
                "            Adalberto Antonio Jorge\n" +
                "            Adam Arnau José\n" +
                "            Adán Arturo Jose Antonio\n" +
                "            Adiran Asier Jose Luis\n" +
                "            Adolfo Augusto Jose Manuel\n" +
                "            Adrià Aurelio Jose Maria\n" +
                "            Adrián Baltasar Juan\n" +
                "            Agustín Bartolomé Blas\n" +
                "            Aimar Basilio Juan Antonio\n" +
                "            Aitor Benito Boris\n" +
                "            Alano Benjamín Juan Carlos\n" +
                "            Alberto Bernardo Borja\n" +
                "            Aldo Bienvenido Brahim\n" +
                "            Aleix Blas Brais\n" +
                "            Alejandro Boris Bruno\n" +
                "            Alejo Borja Calisto\n" +
                "            Alex Brahim Juan José\n" +
                "            Alfonso Brais Camilo\n" +
                "            Alfredo Bruno Juan Manuel\n" +
                "            Alonso Calisto Carlos\n" +
                "            Álvaro Camilo Julio\n" +
                "            Amadeo Carlos Cayetano\n" +
                "            Amado Cayetano César\n" +
                "            Amando César Christian\n" +
                "            Ambrosio Christian Claudio\n" +
                "            Amin Claudio Clemente\n" +
                "            Anastasio Clemente Conrado\n" +
                "            Ander Conrado Constantino\n" +
                "Constantino Francisco Javier Joel\n" +
                "Crispín Francisco José Jon\n" +
                "Cristian Gabriel Jordi\n" +
                "Daniel Gaspar Jorge\n" +
                "Darío Gerard José\n" +
                "David Gerardo Jose Antonio\n" +
                "Desiderio Germán Jose Luis\n" +
                "Diego Gonzalo Jose Manuel\n" +
                "Dionisio Gregorio Jose Maria\n" +
                "Domingo Guillem Juan\n" +
                "Donato Guillermo Juan Antonio\n" +
                "Edgar Gustavo Juan Carlos\n" +
                "Edmundo Hamza Juan José\n" +
                "Eduardo Héctor Juan Manuel\n" +
                "Elías Honorato Julio\n" +
                "Eloy Hugo Justino\n" +
                "Emilio Humberto Justo\n" +
                "Eneko Ibai Kevin\n" +
                "Enrique Ibrahim Kilian\n" +
                "Eric Ignacio Leo\n" +
                "Ernesto Iker Leopoldo\n" +
                "Esteban Isidoro Lorenzo\n" +
                "Eugenio Ismael Louis\n" +
                "Eusebio Ivo Lucas\n" +
                "Fabián Izan Luciano\n" +
                "Federico Jaime Luis\n" +
                "Felipe Jan Macario\n" +
                "Félix Jaume Manuel\n" +
                "Fermín Javier Marc\n" +
                "Fernando Jesús Marcelo\n" +
                "Fidel Joan Marco\n" +
                "Francisco Joaquín Marcos\n" +
                "Marcos Pau Tomás\n" +
                "Mariano Pedro Ulises\n" +
                "Mario Pelayo Unai\n" +
                "Marti Plácido Urbano\n" +
                "Martín Platón Valentín\n" +
                "Mateo Pol Vicente\n" +
                "Matías Ponce Víctor\n" +
                "Mauricio Quintín Virgilio\n" +
                "Maximiliano Rafael Walter\n" +
                "Máximo Ramiro Wen\n" +
                "Miguel Ramón Xabier\n" +
                "Miguel Ángel Raúl Xavier\n" +
                "Mikel Ricardo Ximen\n" +
                "Mohamed Roberto Yerai\n" +
                "Moisés Rodrigo Yeray\n" +
                "Nabil Rogelio Yunes\n" +
                "Narciso Román Yusef\n" +
                "Nathan Rubén Zacarías\n" +
                "Nicolás Salvador Zenon\n" +
                "Noé Samuel Zoilo\n" +
                "Octavio Santiago\n" +
                "Oier Sebastián\n" +
                "Omar Sergi\n" +
                "Oriol Sergio\n" +
                "Óscar Silvestre\n" +
                "Pablo Simón\n" +
                "Pancho Teodoro");
        int i=0;
        nombres = new String[285];
        String[] names = listNames.toString().split("\n");
        for (String y : names) {
            y = y.trim();
            for (String x : y.split(" ")) {
                nombres[i++] = x;
            }
        }
    }
    public void GetPreNames(){
        String listNames ="Acosta, Acuña, Aguilar, Aguirre, Agustín, Ahumada, Alanis, Alarcón, Alayón, Alcázar, Alcocer, Alfaro, Almendárez, Altamirano, Álvarez, Alzate, Amador, Anaya, Argüelles, Arjona, Arriaga, Arrollo, Ayala " +
                "Baca, Báez, Baños, Barba, Barrera, Barrientos, Barriga, Bastida, Batalla, Bautista, Bazán, Becerra, Becerril, Bello, Beltrán, Benítez, Bernal, Bolaños, Bonilla, Borges, Bustamante, Busto"+
                "Caballero, Cabeza, Cabrera, Cadenas, Caldera, Calleja, Calles, Camacho, Camareno, Camarillo, Campos, Cárdenas, Cardoso, Carranza, Carrillo, Carvajal, Carvallo, Casas, Castellanos Castañeda, Cepeda, Cerda, Cervantes, Céspedes, Cevallos, Cevedo, Chávez, Chavira, Cisneros, Collado, Cordero, Cornejo, Correa, Corro, Cuéllar, Cuervo, Cuesta, Cuevas " +
                "Daniel, Darío, Dávila, De Aguilar, De Alba, De la Cruz, De la Cuesta, De la Fuente, De la Rosa, Del Castillo, Doblado, Domínguez, Donato, Dorado, Duarte, Dueñas Echeverría, Elizondo, Enríquez, Escalante, Escamilla, Escobar, Escobedo, Escoto, Escovar, Espino, Esquivel, Estévez, Estrada, Estrella "+
                "Fábregas, Falcón, Farías, Fernández, Ferreira, Ferrer, Fierro, Figueras, Flores, Fonseca, Fraga, Frías, Fuentes, Funez "+
                "Gaitán, Galán, Galeano, Galeno, Galindo, Gallegos, Galván, Gamboa, Gámez, García, Garrido, Gavilán, Gayoso, Gaytán, Gillén, Godines, Gómez, Góngora, Granada, Granados, Grijalba, Guardado, Guardiola, Guerrero, Guillén, Gutiérrez, Guzmán " +
                "Lacayo, Lafuente, Lagos, Lagunal, Lamas, Lández, Larios, Lastreto, Lázaro, Leandro, Lemus, Leyva, Linares, Lines, Lira, Lizano, Llano, Lobo, Lombardo, López, Loredo, Lorio, Losada, Lozano, Lucas, Lugo, Luna ";
        int i=0;
        apellidos = new String[173];
        for (String y : listNames.split(",")) {
            y = y.trim();
                apellidos[i++] = y;
        }
    }
    public void GetDir(){
        String dir ="Calle Guillermo Fatás Cabeza\n" +
                "\uF0B7 Calle José Camón Aznar\n" +
                "\uF0B7 Calle José María Lacarra\n" +
                "\uF0B7 Plaza Antonio Martínez Beltrán\n" +
                "\uF0B7 Avenida Santa Isabel\n" +
                "\uF0B7 Calle de Santa Alodia\n" +
                "\uF0B7 Calle de Santa Isabel\n" +
                "\uF0B7 Calle San Vicente de Paul\n" +
                "\uF0B7 Calle San Vicente Mártir\n" +
                "\uF0B7 Plaza de San Miguel\n" +
                "\uF0B7 Andador Al-Muqtadir\n" +
                "\uF0B7 Calle Alfonso I\n" +
                "\uF0B7 Calle Alfonso V\n" +
                "\uF0B7 Calle Don Jaime I\n" +
                "\uF0B7 Calle Pedro IV el Ceremonioso\n" +
                "\uF0B7 Avenida Francia\n" +
                "\uF0B7 Calle Agustina de Aragón\n" +
                "\uF0B7 Calle Asalto\n" +
                "\uF0B7 Calle Basilio Boggiero\n" +
                "\uF0B7 Calle Casta Álvarez\n" +
                "\uF0B7 Calle José Palafox, hotel y cine Palafox\n" +
                "\uF0B7 Paseo María Agustín\n" +
                "\uF0B7 Puente de Los Sitios y plaza de Los Sitios\n" +
                "\uF0B7 Avenida Hudíes\n" +
                "\uF0B7 Calle Cinco de Marzo\n" +
                "\uF0B7 Calle de los Broqueleros\n" +
                "\uF0B7 Calle Manifestación\n" +
                "\uF0B7 Calle Reconquista\n" +
                "\uF0B7 Calle Tyibíes\n" +
                "\uF0B7 Plaza Aragón\n" +
                "\uF0B7 Plaza del Justicia\n" +
                "\uF0B7 Avenida de la Almozara\n" +
                "\uF0B7 Avenida Puerta Sancho\n" +
                "\uF0B7 Barrio Oliver\n" +
                "\uF0B7 Calle del Temple\n" +
                "\uF0B7 Calle La Azucarera\n" +
                "\uF0B7 Calle Torre Nueva\n" +
                "\uF0B7 Calle Universidad\n" +
                "\uF0B7 Camino de Las Torres\n" +
                "\uF0B7 Instituto Medina Albaida\n" +
                "\uF0B7 Jardines de la Taifa de Saraqusta\n" +
                "\uF0B7 Parque Castillo Palomar\n" +
                "\uF0B7 Parque Sedetania\n" +
                "\uF0B7 Plaza del Portillo\n" +
                "\uF0B7 Plaza La Misericordia\n" +
                "\uF0B7 Puerta Cinegia\n" +
                "\uF0B7 Andador Giuseppe Verdi\n" +
                "\uF0B7 Avenida Goya\n" +
                "\uF0B7 Avenida Tenor Fleta\n" +
                "\uF0B7 Calle Adolfo Aznar\n" +
                "\uF0B7 Calle Antonio Saura\n" +
                "\uF0B7 Calle Carlos Saura\n" +
                "\uF0B7 Calle Cineasta Segundo de Chomón\n" +
                "\uF0B7 Calle Felisa Galé\n" +
                "\uF0B7 Calle Francisco Martínez Soria\n" +
                "\uF0B7 Calle J.M. Beltrán\n" +
                "\uF0B7 Calle José Luis Borau\n" +
                "\uF0B7 Calle José Oto\n" +
                "\uF0B7 Calle Julio García Condoy\n" +
                "\uF0B7 Calle Luis Buñuel\n" +
                "\uF0B7 Calle Manuel Viola\n" +
                "\uF0B7 Calle Miguel Asso\n" +
                "\uF0B7 Calle Nobleza Baturra\n" +
                "\uF0B7 Calle Pablo Bruna\n" +
                "\uF0B7 Calle Pascual Albero Burillo\n" +
                "\uF0B7 Calle Pascuala Perié\n" +
                "\uF0B7 Calle Teresa Salvo Puerto\n" +
                "\uF0B7 Calle Unceta\n" +
                "\uF0B7 Calle Vicente Berdusán\n" +
                "\uF0B7 Paseo Echegaray y Caballero\n" +
                "\uF0B7 Avenida El Día\n" +
                "\uF0B7 Avenida Pablo Gargallo\n" +
                "\uF0B7 Biblioteca María Moliner\n" +
                "\uF0B7 Calle Alfonso Zapater\n" +
                "\uF0B7 Calle Ana Abarca Bolea\n" +
                "\uF0B7 Calle Andalán\n" +
                "\uF0B7 Calle Benito Pérez Galdos\n" +
                "\uF0B7 Calle Doctor Cerrada\n" +
                "\uF0B7 Calle Francisco Oliván Bayle\n" +
                "\uF0B7 Calle Hasdai Ben Yusuf\n" +
                "\uF0B7 Calle Jerónimo Zurita\n" +
                "\uF0B7 Calle José Pardo Asso\n" +
                "\uF0B7 Calle Juan Pablo Bonet\n" +
                "\uF0B7 Calle Juan Tomás Porcell\n" +
                "\uF0B7 Calle Ramón Pignatelli\n" +
                "\uF0B7 Calle Ramón y Cajal\n" +
                "\uF0B7 Calle Roque Joaquín Alcubierre\n" +
                "\uF0B7 Hospital Miguel Servet\n" +
                "\uF0B7 Jardines de Avempace\n" +
                "\uF0B7 Avenida Alcalde Gómez Laguna\n" +
                "\uF0B7 Avenida Cesáreo Alierta\n" +
                "\uF0B7 Avenida Conde Aranda\n" +
                "\uF0B7 Calle Berenguer de Bardají\n" +
                "\uF0B7 Calle de Don Juan de Aragón\n" +
                "\uF0B7 Calle Domingo Ram\n" +
                "\uF0B7 Calle Don Pedro de Luna\n" +
                "\uF0B7 Calle Francisco Cantín y Gamboa\n" +
                "\uF0B7 Calle Isidoro Antillón\n" +
                "\uF0B7 Calle Joaquín Costa\n" +
                "\uF0B7 Calle José Martí\n" +
                "\uF0B7 Calle Leopoldo Romeo\n" +
                "\uF0B7 Calle Madre Rafols\n" +
                "\uF0B7 Calle Marqués de la Cadena\n" +
                "\uF0B7 Calle Santiago Dulong\n" +
                "\uF0B7 Parque Bruil\n" +
                "\uF0B7 Parque Labordeta\n" +
                "\uF0B7 Plaza Basilio Paraíso\n" +
                "\uF0B7 Calle Capitán Esponera\n" +
                "\uF0B7 Calle Francisco Espoz y Mina\n" +
                "\uF0B7 Calle General Mayandía\n" +
                "\uF0B7 Paseo Calanda\n" +
                "\uF0B7 Parque Labordeta\n" +
                "\uF0B7 Calle Valero Julio Ripoll\n" +
                "\uF0B7 Calle Mariano Renovales\n" +
                "\uF0B7 Calle José María Lacarra\n" +
                "\uF0B7 Calle Capitán Pina\n" +
                "\uF0B7 Calle General Sueiro\n" +
                "\uF0B7 Calle Padre Marcellán Mayayo\n" +
                "\uF0B7 Parque Primo de Rivera";
        dir = dir.replace("\uF0B7", "");
        int i=0;
        direcciones = new String[119];
        for (String x : dir.split("\n")){
            direcciones[i++] =x;
        }
    }
    public void GetCat(){
        String a = "biologia\n" +
                "matematicas\n" +
                "fisica\n" +
                "pintura\n" +
                "escultura\n" +
                "arte\n" +
                "historia de España\n" +
                "historia\n" +
                "insectos\n" +
                "dinosaurios\n" +
                "paleontologia\n" +
                "carpinteria\n" +
                "mamiferos\n" +
                "jardineria\n" +
                "botanica\n" +
                "cosmetica\n" +
                "astrofisica\n" +
                "astrologia\n" +
                "rosa\n" +
                "politica";
        categorias = new String[20];
        int i=0;
        for (String x : a.split("\n")){
            categorias[i++]=x;
        }
    }
    public String randomTelf(){
        StringBuilder telf = new StringBuilder("6");
        for (int i=0; i<8; i++){
            telf.append((int)(Math.random()*10));
        }
        return telf.toString();
    }
    public String randomDNI(){
        StringBuilder dni = new StringBuilder();
        for (int i=0; i<8; i++){
            dni.append((int)(Math.random()*10));
        }
        int c = (int)(Math.random()*8)+65;
        dni.append((char)c);
        return dni.toString();

    }
    public String randomName(){
        int num = (int)(Math.random()*nombres.length);
        return nombres[num];
    }
    public String randomPrename(){
        int num = (int)(Math.random()*apellidos.length);
        return apellidos[num];
    }
    public String randomDir(){
        int num = (int)(Math.random()*direcciones.length);
        return direcciones[num].trim()  ;
    }
    public String randomFecha(){
        StringBuilder builder = new StringBuilder();
        int d = (int)(Math.random()*28)+1;
        if (d<10){
            builder.append(0);
        }
        builder.append(d+"/");
        int m = (int)(Math.random()*12)+1;
        if (m<10){
            builder.append(0);
        }
        builder.append(m+"/");

        int y = (int)(Math.random()*11)+2010;
        builder.append(y);
        return builder.toString();
    }
    public String randomCat(){
        int num = (int)(Math.random()*20);
        return categorias[num];
    }
    public int randomSal(){
        int rand = (int)(Math.random()*30)*100+1500;
        return rand;
    }
    public String randomExp(){
        int num = (int)(Math.random()*3);
        if (num==0){
            return "junior";
        }
        if (num==1){
            return "senior";
        }
        return "advanced";
    }
    public String randomFromVec(String[] curr){
        int random = (int)(Math.random()*curr.length);
        return curr[random];

    }
    public void insertEMPLEADO(int cod, int codEmpresa){
        //insert into empleados values('1001','101', 'Vlad', 'Dumitru', 'Calle septimo sello', 'X1254879T', '622427448',default);

        StringBuilder builder = new StringBuilder("insert into empleados values( '"+
                cod+"','"+codEmpresa+"','"+randomName()+"','"+randomPrename()+"','"+randomDir()+"','"+randomDNI()+"','"+randomTelf()+"','"+randomFecha()+
                "');");
        System.out.println(builder.toString());
    }
    public void insertEMPRESAS(int cod){
        //insert into empresas values ('Marietes_Madrid', 'Avenida Madrid', '100',  '610318921', '990005456' );
        //insert into empresas values ('Marietes_Zaragoza', 'Calle Afondo Nº20', '101',  '622427441', '990055488' );

        StringBuilder builder = new StringBuilder("insert into empresas values( '"+
                "Marietes_','"+randomDir()+"','"+cod+"','"+randomTelf()+"','"+randomTelf()+
                "');");
        System.out.println(builder.toString());
    }
    public void insertPERIODISTA(int cod, int codEmp, int codEquipo){
        //insert into periodista values(201, 1001, 'paleontologia', 3000, 'junior');

        StringBuilder builder = new StringBuilder("insert into periodistas values( '"+
                cod+"','"+codEmp+"','"+codEquipo+"','"+randomCat()+"','"+randomSal()+"','"+randomExp()+"');");
                System.out.println(builder.toString());
    }
    public void insertDISEÑADOR(int cod, int codEmp){
        //insert into diseñadores values(301,1002,5000);
        StringBuilder builder = new StringBuilder("insert into diseñadores values( '"+
                cod+"','"+codEmp+"','"+randomSal()+"');");
        System.out.println(builder.toString());
    }
    public int randomOrd(){
        return (int)(Math.random()*100)+1;
    }
    public void GetRevistas(){
        String text = "Acerca De Ti\n" +
                "Hobby\n" +
                "Revistas Imperium\n" +
                "Magnate\n" +
                "Nova\n" +
                "La Brecha Dorada\n" +
                "La Paradoja\n" +
                "Nexus\n" +
                "La Popular\n" +
                "Juventud activa\n" +
                "La Trivi\n" +
                "Magazine Lux\n" +
                "Luna Nueva\n" +
                "Imperio Juvenil\n" +
                "Revista Mantra\n" +
                "El Resplandor\n" +
                "Tendencia Chic\n" +
                "Ósmosis\n" +
                "Al Aire Libre\n" +
                "Pleneta Urbano\n" +
                "Generación Milenial\n" +
                "Tu Esencia\n" +
                "Renacer\n" +
                "La Guía\n" +
                "Mente Sana\n" +
                "Spectrum Magazine\n" +
                "El Arte Mental\n" +
                "Vida Estudiantil\n" +
                "El Clan\n" +
                "Rider Escolar\n" +
                "Área Gris\n" +
                "Flash Mental\n" +
                "El Semanario\n" +
                "El Arca Escolar\n" +
                "Mis Bases\n" +
                "Encontrándome\n" +
                "El Bazar De Las Ideas\n" +
                "Revista Club\n" +
                "Motivarte\n" +
                "La Tribu\n" +
                "La Temática\n" +
                "Revista Master\n" +
                "Campus Prime\n" +
                "La Central Educativa\n" +
                "El Gran Mentor\n" +
                "La Máxima Magazine\n" +
                "Vanidades Del Ahora\n" +
                "Para Tí\n" +
                "Impacta\n" +
                "Glamurosa\n" +
                "Estilo Único\n" +
                "Nova Influencia\n" +
                "Corrientes Chic\n" +
                "Todo Mujer\n" +
                "Genuinamente\n" +
                "Matices\n" +
                "La Gran Vanguardia\n" +
                "Actual Mujer\n" +
                "Con Estilo\n" +
                "Icónos\n" +
                "Más Que Chic\n" +
                "Innova Magazine\n" +
                "Signos\n" +
                "Horizonte Abierto\n" +
                "Viaje De Palabras\n" +
                "Revista Enlace\n" +
                "Sociedad Inspirada\n" +
                "Expresarte\n" +
                "Puente Cultural\n" +
                "Impacto Cultural\n" +
                "Destinos\n" +
                "CulturaTrek\n" +
                "Panorama\n" +
                "El Gran Apolo\n" +
                "Revista Crecer\n" +
                "Conexiones\n" +
                "Conexiones\n" +
                "El Guardián\n" +
                "Horizonte Azul\n" +
                "Nuevos horizontes\n" +
                "Explorador cultural\n" +
                "Revista Raíces\n" +
                "Cervantes Vive\n" +
                "Cultura Viva\n" +
                "Vivir Viajando\n" +
                "LiterArte\n" +
                "Iniciativa Horizontes\n" +
                "Crónicas\n" +
                "Mente Abierta\n" +
                "Revista Viajera\n" +
                "Mentes Científicas\n" +
                "La Espiral Dorada\n" +
                "El Avance\n" +
                "Entre Líneas\n" +
                "Experta!\n" +
                "Visión Científica\n" +
                "Expertís\n" +
                "El Umbral Científico\n" +
                "Frontline Científica\n" +
                "La Avanzada\n" +
                "La Oleada\n" +
                "Expedición\n" +
                "Viva Idea\n" +
                "EL Gran Radar\n" +
                "CientificAcción\n" +
                "Ciencia Activa\n" +
                "Explora\n" +
                "Tiempos De Historia\n" +
                "Épocas\n" +
                "Nuevo Milenio\n" +
                "Más allá de tus fronteras\n" +
                "Perspectiva\n" +
                "Oceanía\n" +
                "Abriendo Caminos\n" +
                "Aprende tu mundo\n" +
                "Sigma\n" +
                "Revista Republic\n" +
                "Nativa\n" +
                "Revistasio\n" +
                "El Origen\n" +
                "Expansión\n" +
                "Más Que Historia\n" +
                "El Nuevo Despertar\n" +
                "Alerta Mental\n" +
                "Porta Voz\n" +
                "Atlas\n" +
                "Revista Net\n" +
                "Tiempo De Revista\n" +
                "Tiempo Real\n" +
                "Al Compás\n" +
                "La Antesala\n" +
                "Hoy En Día\n" +
                "La Global\n" +
                "Revista Wiki\n" +
                "El Vanguardista\n" +
                "Centinela\n" +
                "Magnum\n" +
                "Memoria Mística\n" +
                "Matutinamente\n" +
                "La Gaceta\n" +
                "Life Style\n" +
                "Extreme Magazine\n" +
                "Magazine Bloom\n" +
                "Magazine Plus\n" +
                "Hone Zone\n" +
                "Legend Magazine\n" +
                "Flash Quarter\n" +
                "InStyle\n" +
                "Liberty\n" +
                "My Space\n" +
                "Fast magazine\n" +
                "Connect\n" +
                "Prime Magazine\n" +
                "La Céntrica\n" +
                "La Estatal\n" +
                "Enfoque Deportivo\n" +
                "Primera Línea\n" +
                "Deporte Táctico\n" +
                "Invicta\n" +
                "A Pulso\n" +
                "El Circuíto\n" +
                "Plug Deportes\n" +
                "La Saga\n" +
                "Fuente Deportiva\n" +
                "Emporium Deportivo\n" +
                "Safari\n" +
                "Multi Sport\n" +
                "Deportry\n" +
                "Guía Sport\n" +
                "La Sumprema\n" +
                "El Audáz\n" +
                "Filosofía Ya!\n" +
                "Gran Estándar\n" +
                "Aspecto Filosófico\n" +
                "Línea Filosofal\n" +
                "El Prospecto\n" +
                "Doble Visión\n" +
                "Dilemas\n" +
                "Abstracta\n" +
                "Vida aristotélica\n" +
                "Eutopía\n" +
                "Filosofía Jet\n" +
                "Expedición Filosófica\n" +
                "Ola Filosófica\n" +
                "Tiempo Filosofal\n" +
                "Canvax\n" +
                "Carmesí\n" +
                "Fusión\n" +
                "Más Que Caras\n" +
                "Crossover\n" +
                "Conceptos\n" +
                "Revista Platino\n" +
                "La Nuestra\n" +
                "Siempre Gente\n" +
                "Blox\n" +
                "Tras Bambalinas\n" +
                "El Golfo\n" +
                "La Nueva\n" +
                "Mis Vanidades\n" +
                "Revista Okra\n" +
                "La Cotidiana\n" +
                "Revista Enigmática";

        revistas = text.split("\n");
    }
    public String randomRevistas(){
        return randomFromVec(revistas);
    }
    public String randomValoracion(){
        return randomFromVec(valoracion);
    }
    public String randomPublico(){
        return randomFromVec(publico);
    }
    public String randomTamaño(){
        return randomFromVec(tamaño);
    }

    public void insertOFICINAS(int cod){
        //insert into oficinas values(401, 'Oficina los Pericos', 43,'Domingo de ramos', '632125784');
        StringBuilder builder = new StringBuilder("insert into oficinas values( '"+
                cod+"','"+"Oficina los "+randomName()+"s','"+randomOrd()+"','"+randomDir()+"','"+randomTelf()+"');");
        System.out.println(builder.toString());
    }
    public void insertEQUIPOS(int cod, int codDis){
        //insert into equipos values(501, 301,401,'789456354',0);
        StringBuilder builder = new StringBuilder("insert into equipos values( '"+
                cod+"','"+codDis+"','"+codDis+"','"+randomTelf()+"',0);");
        System.out.println(builder.toString());
    }
    public void insertREVISTAS(int cod, int emp, int rev){
    //insert into revistas values('2001','301','Mejores Tatuajes',default,'adultos','rosa','12-02-2021');
        StringBuilder builder = new StringBuilder("insert into revistas values( '"+
                cod+"','"+emp+"','"+revistas[rev]+"','"+randomValoracion()+"','"+randomPublico()+"','"+randomCat()+"','"+randomFecha()+"');");
        System.out.println(builder.toString());
    }
    public void insertSECCIONES(int cod, int rev, int eq){
        //insert into secciones values('0','2002', '5002', 'rosa', 'corto' );
        StringBuilder builder = new StringBuilder("insert into secciones values( '"+
                cod+"','"+rev+"','"+eq+"','"+randomCat()+"','"+randomTamaño()+"');");
        System.out.println(builder.toString());
    }
    public void insertEJEMPLARES(int cod, int rev){
        //insert into ejemplares values('0', '2002', 12);
        StringBuilder builder = new StringBuilder("insert into secciones values( '"+
                cod+"','"+rev+"','"+randomNum(1,15)+"');");
        System.out.println(builder.toString());
    }
    public int randomNum(int a, int b){
        return (int)(Math.random()*(b-a+1))+a;
    }
    public static void main(String[] args) {
        InsertCreator a = new InsertCreator();
        int rev = 0;
        int cod = 0;
        while (cod<11000){
            a.insertSECCIONES(cod,a.randomNum(2000,2201), a.randomNum(3,12));
            cod++;
        }
    }

}
