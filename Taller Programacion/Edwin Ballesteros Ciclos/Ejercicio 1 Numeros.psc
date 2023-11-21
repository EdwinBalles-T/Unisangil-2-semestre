Algoritmo numeros
	Definir S Como Real
	Definir N Como Real
	Definir P Como Real
	Definir i Como Real
	Definir G Como Real
	Definir V Como Real
	Definir H como numeros
	Para i<-1 Hasta 40 Hacer
		Escribir 'Digite su numero'
		Leer S
		Si S>=0 Entonces
			S <- P
			V <- V+P
			P <- P+1
		SiNo
			S <- N
			G <- G+N
			N <- N+1
		FinSi
	FinPara
	H = (G+V)/40
	Escribir 'La suma de negativos es ',G
	Escribir 'La suma de positivos es ',V
	Escribir 'Hay ',N,' numeros negativos'
	Escribir 'Hay ',P,' numeros positivos'
	Escribir "El promedio total es: ",H
FinAlgoritmo
