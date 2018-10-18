//TOMANDO COMO BASE EL MISMO EJERCICIO PERO TRANSFORMANDOLO UN POCO 

Agregue lo siguiente al ejercicio anterior
Agregue la clase base persona con los atributos protegidos, haga que esta clase sea una clase abstracta, agregue el metodo
 abstracto registrar  
Defina la subclase paciente con los atributos tipo de sangre, seguro, peso, fecha de nacimiento, haga que esta clase herede 
de la clase persona
Implemente (sobreescriba) el metodo registrar paciente en la subclase 
------------------------------------------------------------------------------
//DEFINIR LA CLASE BASE PERSONA QUE SEA ABSTRACTA 

abstracta clase persona // con la palabra abstracta hago que la clase sea abstracta

	protegido definir nombre como caracter //asigno el modificador protegido a cada atributo 
	protegiso definir cedula como caracter

metodo registrar () // metodo abstracto

fin clase
-----------------------------------------------------------------------------------------------------------------------
// DEFINIR LA CLASE PACIENTE 

clase paciente extiende Persona // hereda de persona 

	privado definir peso como real
	privado definir seguro como logico 
	privado definir nacimiento como fecha 
	privado definir tiposangre como caracter
	privado definir virus como coleccion<viral> 

// CONSTRUCTOR
	
	publico metodo paciente() //CONSTRUCTOR POR DEFECTO  NOTESE QUE DEBE TENER EL MISMO NOMBRE DE LA CLASE
		nombre= ""
		cedula= "V-"
		seguro=falso
		enfermedad=""
		peso=0
		nacimiento= null 
	fin metodo 
	
//Implemente (sobreescriba) el metodo registrar paciente en la subclase 
	
	metodo registrar() //metodo heredado de la clase base, que obligatoriamente se debe implementar
		
		mostrar "Ingrese el nombre y cedula del paciente"
		Leer nombre, cedula
		mostrar "Ingrese 1 si el paciente tiene seguro, 0 si no tiene seguro"
		Leer seguro
		nacimiento=  nuevo fecha() // se instancia la clase fecha y asi le asigno un objeto fecha automaticamente al atributo 
		nacimiento.registrar_fecha() // teniendo el objeto fecha instanciado puedo usar el metodo registrar de fecha
		
	fin metodo
 	
//METODO PARA MOSTRAR LA INFORMACION DEL PACIENTE
	
	metodo mostrar_datos() 
		 mostrar "Los datos del pacente son:"
		 mostrar "Nombre: ", nombre, "C.I.", cedula
		 mostrar "Su peso es:", peso
		 mostrar "Nacio el dia: ",nacimiento.mostrar_fecha()//puedo usar este metodo porque tengo un objeto fecha en clase paciente
		 mostrar "Posee Seguro Medico", seguro 
	 fin metodo

	 
Fin clase 
-----------------------------------------------------------------------------------------------------------------

ALGORITMO 

definir paciente como Paciente
// no necesito instanciar la fecha porque ya la instancio en el metodo registrar de paciente

paciente = nuevo Paciente ()


paciente.registrar()
paciente.mostrar_datos()

FIN ALGORITMO
