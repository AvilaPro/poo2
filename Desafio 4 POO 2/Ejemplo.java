//TOMANDO COMO BASE EL MISMO EJERCICIO PERO TRANSFORMANDOLO UN POCO 

COLECCIONES 
Un consultorio medico atiende a diario una gran cantidad de pacientes, cada paciente se puede registrar en el sistema
asi como tambien se pueden registrar los virus (coleccion) que ha padecido el paciente. 
Diseñe un algoritmo que permita registrar pacientes y lso virus que ha tenido y visualizar todos los virus que este ha sufrido 

Solucion:
Defina la clase enfermedad con los atributos nombre y tipo
En la clase paciente, agregar un atributo coleccion de objetos de la clase enfermedad
Agregar metodos para registrar virus, metodo para conocer la cantidad de virus que ha tenido un paciente (use la propiedad tamaño)
y un metodo que imprima los nombres de los virus que ha sufrido el paciente
-----------------------------------------------------------------------------------------------------------------------
//DEFINIR LA CLASE enfermedad

clase enfermedad
publico definir nombre como caracter
	publico definir tipo como caracter

fin clase
-----------------------------------------------------------------------------------------------------------------------
// DEFINIR LA CLASE PACIENTE 

clase paciente 

	privado definir nombre como caracter
	privado definir cedula como caracter
	privado definir peso como real
	privado definir seguro como logico 
	privado definir nacimiento como fecha 
	privado definir tiposangre como caracter
	privado definir virus como coleccion<enfermedad> // atributo coleccion de objetos de la clase enfermedad

// CONSTRUCTOR
	
	publico metodo paciente() //CONSTRUCTOR POR DEFECTO  NOTESE QUE DEBE TENER EL MISMO NOMBRE DE LA CLASE
		nombre= ""
		cedula= "V-"
		seguro=falso
		enfermedad=""
		peso=0
		nacimiento= null 
	fin metodo 
	
//registrar paciente 
	
	metodo registrar()
		
		mostrar "Ingrese el nombre y cedula del paciente"
		Leer nombre, cedula
		mostrar "Ingrese 1 si el paciente tiene seguro, 0 si no tiene seguro"
		Leer seguro
		nacimiento=  nuevo fecha() // se instancia la clase fecha y asi le asigno un objeto fecha automaticamente al atributo 
		nacimiento.registrar_fecha() // teniendo el objeto fecha instanciado puedo usar el metodo registrar de fecha
		
	fin metodo
 	
//registrar varios virus a un paciente 

metodo registrar_virus()

	definir cantidad como entero 
	mostrar "Ingrese cuantos virus desea registrar"
	leer cantidad //el usuario indica cuantos virus va a registrar para el paciente
	
		para i=0 hasta i<cantidad hacer //repetirse desde 0 hasta la cantidad indicada por el paciente
		
			virus.agregar(nuevo enfermedad()) //instancio un objeto enfermedad y lo agrego a la coleccion virus (usando la opracion agregar)
										//Si no instancio el objeto y no lo agrego a la coleccion, no podre registrar los datos
										//de los virus en la coleccion del paciente
			
			// la instruccion anterior tambien se puede realizar de la siguiente manera:
			
			definir objeto como enfermedad // 1 defino el objeto de la clase enfermedad
			objeto= nuevo enfermedad() //2 instancio 
			virus.agregar(objeto) //3 agrego el objeto instanciado de enfermedad a la coleccion 
			
			//luego de agregar el objeto le asigno los valores solicitando primero al usuario 
			
			mostrar "Ingrese el nombre del virus"
			leer nombrev
			virus[i].nombre=nombrev // le asigno el nombre ingresado por el usuario al objeto virus que esta agregado en la coleccion 
									// se realiza directamente porque los atributos de enfermedad son publicos 
									//de ser privados, se realiza con set 
			mostrar "Ingrese el tipo de virus"
			leer tipov
			virus[i].tipo=tipov // le asigno el nombre al objeto virus agregado a la coleccion 
			
		fin para
fin metodo 

//metodo para conocer la cantidad de virus que ha tenido un paciente (use la propiedad tamaño)

metodo cantidad() como entero

	cant=virus.tamaño() // esta operacion retorna el numero de posiciones (tamaño) que tiene la coleccion virus
	retornar cant

fin metodo
	
//METODO PARA MOSTRAR LA INFORMACION DEL PACIENTE
	
	metodo mostrar datos() 
		 mostrar "Los datos del pacente son:"
		 mostrar "Nombre: ", nombre, "C.I.", cedula
		 mostrar "Su peso es:", peso
		 mostrar "Nacio el dia: ",nacimiento.mostrar_fecha()//puedo usar este metodo porque tengo un objeto fecha en clase paciente
		 mostrar "Posee Seguro Medico", seguro 
	fin metodo

//AGREGAR METODO QUE PERMITA CONOCER TODOS LOS VIRUS QUE HA TENIDO EL PACIENTE
metodo ver_virus()

	cant=virus.tamaño() // esta operacion retorna el numero de posiciones (tamaño) que tiene la coleccion virus
	
	mostrar "El paciente ha tenido los siguientes virus" //muestro un mensaje
	
	para i=0 hasta i<cant hacer // esta instruccion tambien puede ser --> para i=0 hasta virus.tamaño-1 hacer
		mostrar virus[i].nombre // se imprimen todos los nombres de los virus
	fin para

fin metodo
	 
Fin clase 
-----------------------------------------------------------------------------------------------------------------

ALGORITMO 

definir paciente como Paciente
// no necesito instanciar la fecha porque ya la instancio en el metodo registrar de paciente
paciente = nuevo Paciente ()

//Primeramente se registra el paciente

paciente.registrar()

//luego de haber registrado al paciente, consulto si desea registrar virus al paciente, (esta consulta es opcional) 

mostrar "Desea registrar algun virus para el paciente? S/N"
leer respuesta

	si (respuesta="S") entonces //comparo la respuesta ingresada por el usuario
		paciente.registrar_virus() //ejecuto el metodo registrar virus
		
mostrar "Ud ha registrado " paciente.cantidad, "virus al paciente" //muestro la cantidad de virus que ha registrado

mostrar "Desea ver todos los virus registrados al paciente? S/N"
leer respuesta

	si (respuesta="S") entonces 
		paciente.ver_virus() //muestro todos los virus registrados

FIN ALGORITMO
