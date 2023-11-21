Algoritmo sin_titulo
	Dimension v[20]
	Definir i Como Real
	Definir M Como Real
	Definir Numayor Como Real
	Definir Imayor como real
	Definir t como numero
	Escribir 'Escriba sus 20 numeros'
	Para i<-1 Hasta 20 Hacer
		Leer v[i]
	FinPara
	Repetir
		Escribir 'Presione -1 si desea ver el contenido, -2 si desea ver el promedio de datos pares, -3 para ver el numero mayor y sus repeticiones, -4 para ver el mayor dato impar, -5 para mostrar el promedio total y -6 para salir'
		Leer M
		Segun M  Hacer
			1:
				Para i<-1 Hasta 20 Hacer
					Escribir v[i]
				FinPara
			2:
				Para i<-1 Hasta 20 Hacer
					h <- v[i] MOD 2
					Si h=0 Entonces
						e <- e+v[i]
						s <- s+1
					FinSi
				FinPara
				p <- e/s
				Escribir 'El promedio de los numeros pares es: ',p
			3:
				Numayor <- v[1]
				Para i<-1 Hasta 20 Hacer
					Si v[i]>=Numayor Entonces
						Si v[i]=Numayor Entonces
							a <- a+1
						FinSi
						Numayor <- v[i]
					FinSi
				FinPara
				Escribir 'El numero mayor es: ',Numayor,'y se repite: ',a,'veces'
			4:
				Imayor <- 0
				Para i<-1 Hasta 20 Hacer
					t <- v[i] MOD 2
					Si t=1 Entonces
						Si v[i]>Imayor Entonces
							Imayor <- v[i]
						FinSi
					FinSi
				FinPara
				Escribir 'El numero impar mayor es: ',Imayor
			5:
				Para i<-1 Hasta 20 Hacer
					Prom <- Prom+v[i]
				FinPara
				R <- Prom/6
				Escribir 'El promedio total es: ',R
			6:
				Escribir 'Digite 2 para salir'
				Leer t
			De Otro Modo:
				Escribir 'Numero invalido, Lea cuidadosamente las opciones'
		FinSegun
	Hasta Que t=2
FinAlgoritmo
