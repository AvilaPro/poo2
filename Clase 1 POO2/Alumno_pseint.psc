//Clase Estudiante
//definir Promedio, nota_parcial, eval_cont, trab_pract como real
//definir nombre, apellido como caracter
//FinClase

Algoritmo Alumno
	//Definir alumno1 como Estudiante
	//a1=nuevo Estudiante()    (Esto es la instanciacion del objeto)
	
	
	//(Bloque de variables)
	Definir promedio, parcial1, parcial2, parcial3, eval_cont, trab_pract Como Real
	Definir nombre, apellido como caracter
	
	//(Bloque de entradas)    
	Mostrar "Ingrese el nombre del estudiante: " Sin Saltar
	leer nombre //leer a1.nombre             (por aqui estamos leyendo los valores de las variables)
	Mostrar ""
	Mostrar "Ingrese el apellido del estudiante: " Sin saltar
	leer apellido  //leer a1.apellido
	Mostrar ""
	Mostrar "Ingrese las notas de los examenes parciales: "
	Mostrar ""
	Mostrar "Ingrese la nota del parcial 1: " Sin saltar
	Leer parcial1 //leer a1.parcial1                   
	Mostrar "Ingrese la nota del parcial 2: " Sin saltar
	Leer parcial2 //leer a1.parcial2
	Mostrar "Ingrese la nota del parcial 3: " Sin saltar
	Leer parcial3 //leer a1.parcial3
	Mostrar "Ingrese la nota de la evaluacion continua: " Sin saltar
	Leer eval_cont //leer a1.eval_cont
	Mostrar "Ingrese la nota del trabajo practico: " Sin saltar
	Leer trab_pract //leer a1.trab_pract
	
	//(Bloque de Proceso)
	promedio=parcial1+parcial2+parcial3+eval_cont+trab_pract  //(Aqui realizamos algunos calculos)
	//a1.promedio=a1.parcial1+a1.parcial2+a1.parcial3+a1eval_cont+a1.trab_pract
	
	//(Bloque de salida)
	Limpiar Pantalla		//(Aqui realizamos los calculos que vamos a mostrar)
	Mostrar "La nota final de " nombre " " apellido " en escala de 100 puntos es: " promedio   //a1.promedio   
	Mostrar ""
	Mostrar "La nota final de " nombre " " apellido " en escala de 20 puntos es: " (promedio*20)/100  //(a1.promedio*20)/100
	Mostrar ""
	Mostrar "La nota final de " nombre " " apellido " en escala de 4 puntos es: " (promedio*4)/100  //(a1.promedio*4)/100
	Mostrar ""
	
FinAlgoritmo
