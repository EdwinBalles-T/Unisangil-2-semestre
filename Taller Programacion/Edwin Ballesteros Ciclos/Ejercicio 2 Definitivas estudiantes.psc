Algoritmo Definitivas
	Definir i Como Real
	Definir N Como Caracter
	Definir H Como Caracter
	Definir N1 Como Real
	Definir N2 Como Real
	Definir N3 Como Real
	Definir R Como Real
	Para i<-1 Hasta 10 Hacer
		Escribir 'Digite su nombre completo'
		Leer N
		Repetir
			Escribir 'Digite el nombre de la asignatura en minuscula'
			Leer H
			Segun H  Hacer
				'matematicas':
					Escribir 'Escriba sus 3 notas'
					Leer N1,N2,N3
					M <- (N1+N2+N3)/3
				'español':
					Escribir 'Escriba sus 3 notas'
					Leer N1,N2,N3
					E <- (N1+N2+N3)/3
				'sociales':
					Escribir 'Escriba sus 3 notas'
					Leer N1,N2,N3
					S <- (N1+N2+N3)/3
				'ingles':
					Escribir 'Escriba sus 3 notas'
					Leer N1,N2,N3
					In <- (N1+N2+N3)/3
				'filosofia':
					Escribir 'Escriba sus 3 notas'
					Leer N1,N2,N3
					F <- (N1+N2+N3)/3
				'pintura':
					Escribir 'Escriba sus 3 notas'
					Leer N1,N2,N3
					P <- (N1+N2+N3)/3
				'artistica':
					Escribir 'Escriba sus 3 notas'
					Leer N1,N2,N3
					A <- (N1+N2+N3)/3
				De Otro Modo:
					Escribir 'Asegurese de escribir todos los caracteres correctamente y en minuscula'
			FinSegun
			Escribir 'Si ya digito todos sus datos presione 0 o de lo contrario pulse cualquier numero'
			Leer R
		Hasta Que R=0
		G <- (M+E+S+In+F+P+A)/7
		Escribir 'Nombre: ',N
		Escribir 'Definitivas'
		Escribir 'Matematicas: ',M
		Escribir 'Español: ',E
		Escribir 'Sociales: ',S
		Escribir 'Ingles: ',In
		Escribir 'Filosofia: ',F
		Escribir 'Pintura: ',P
		Escribir 'Artistica: ',A
		Escribir 'Su promedio General es: ',G
		Si M>E Entonces
			Si M>S Entonces
				Si M>In Entonces
					Si M>F Entonces
						Si M>P Entonces
							Si M>A Entonces
								Escribir "promedio mas alto, matematicas"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					SiNo
						Si F>P Entonces
							Si F>A Entonces
								Escribir "promedio mas alto, filosofia"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					FinSi
				SiNo
					Si In>F Entonces
						Si In>P Entonces
							Si In>A Entonces
								Escribir "promedio mas alto, ingles"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					SiNo
						Si F>P Entonces
							Si F>A Entonces
								Escribir "promedio mas alto, filosofia"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					FinSi
				FinSi
			SiNo
				Si S>In Entonces
					Si S>F Entonces
						Si S>P Entonces
							Si S>A Entonces
								Escribir "promedio mas alto, sociales"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					SiNo
						Si F>P Entonces
							Si F>A Entonces
								Escribir "promedio mas alto, filosofia"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					FinSi
				SiNo
					Si In>F Entonces
						Si In>P Entonces
							Si In>A Entonces
								Escribir "promedio mas alto, ingles"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					SiNo
						Si F>P Entonces
							Si F>A Entonces
								Escribir "promedio mas alto, filosofia"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		SiNo
			Si E>S Entonces
				Si E>In Entonces
					Si E>F Entonces
						Si E>P Entonces
							Si E>A Entonces
								Escribir "promedio mas alto, español"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					SiNo
						Si F>P Entonces
							Si F>A Entonces
								Escribir "promedio mas alto, filosofia"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "pormedio mas alto, artistica"
							FinSi
						FinSi
					FinSi
				SiNo
					Si In>F Entonces
						Si In>P Entonces
							Si In>A Entonces
								Escribir "promedio mas alto, ingles"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					SiNo
						Si F>P Entonces
							Si F>A Entonces
								Escribir "promedio mas alto, filosofia"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					FinSi
				FinSi
			SiNo
				Si S>In Entonces
					Si S>F Entonces
						Si S>P Entonces
							Si S>A Entonces
								Escribir "promedio mas alto, sociales"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					SiNo
						Si F>P Entonces
							Si F>A Entonces
								Escribir "promedio mas alto, filosofia"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					FinSi
				SiNo
					Si In>F Entonces
						Si In>P Entonces
							Si In>A Entonces
								Escribir "promedio mas alto, ingles"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					SiNo
						Si F>P Entonces
							Si F>A Entonces
								Escribir "promedio mas alto, filosofia"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						SiNo
							Si P>A Entonces
								Escribir "promedio mas alto, pintura"
							SiNo
								Escribir "promedio mas alto, artistica"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		Escribir "Gracias por ingresar, puede retirarse"
	FinPara
FinAlgoritmo
