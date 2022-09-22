package ProyectoArrays;
import java.util.Scanner;
public class Sudoku {
    public static final int DIMENSION_TABLERO = 9;
	public static final int DIMENSION_CAJA = 3;

	public static void main(String[] args) {
		Sudoku.ejecutar();
	}

	public static void ejecutar() {
		int[][] celdas = new int[DIMENSION_TABLERO][DIMENSION_TABLERO];
		int ocupacion = 0;
		ocupacion = Sudoku.iniciar(celdas);
		Sudoku.jugar(celdas, ocupacion);
	}

	public static int iniciar(int[][] celdas) {
		int ocupacion = 0;
		for (int fila = 0; fila < DIMENSION_TABLERO; fila++) {
			for (int columna = 0; columna < DIMENSION_TABLERO; columna++) {
				celdas[fila][columna] = 0;
			}
		}

		celdas[0][0] = 5;
		ocupacion++;
		celdas[0][1] = 3;
		ocupacion++;
		celdas[0][4] = 7;
		ocupacion++;
		celdas[1][0] = 6;
		ocupacion++;
		celdas[1][3] = 1;
		ocupacion++;
		celdas[1][4] = 9;
		ocupacion++;
		celdas[1][5] = 5;
		ocupacion++;
		celdas[2][1] = 9;
		ocupacion++;
		celdas[2][2] = 8;
		ocupacion++;
		celdas[2][7] = 6;
		ocupacion++;
		celdas[3][0] = 8;
		ocupacion++;
		celdas[3][4] = 6;
		ocupacion++;
		celdas[3][8] = 3;
		ocupacion++;
		celdas[4][0] = 4;
		ocupacion++;
		celdas[4][3] = 8;
		ocupacion++;
		celdas[4][5] = 3;
		ocupacion++;
		celdas[4][8] = 1;
		ocupacion++;
		celdas[5][0] = 7;
		ocupacion++;
		celdas[5][4] = 2;
		ocupacion++;
		celdas[5][8] = 6;
		ocupacion++;
		celdas[6][1] = 6;
		ocupacion++;
		celdas[6][6] = 2;
		ocupacion++;
		celdas[6][7] = 8;
		ocupacion++;
		celdas[7][3] = 4;
		ocupacion++;
		celdas[7][4] = 1;
		ocupacion++;
		celdas[7][5] = 9;
		ocupacion++;
		celdas[7][8] = 5;
		ocupacion++;
		celdas[8][4] = 8;
		ocupacion++;
		celdas[8][7] = 7;
		ocupacion++;
		celdas[8][8] = 9;
		ocupacion++;

		return ocupacion;
	}

	public static void jugar(int[][] celdas, int ocupacion) {
		Sudoku.mostrar(celdas);
		while (ocupacion != DIMENSION_TABLERO * DIMENSION_TABLERO) {
			System.out.print("Introduzca una fila [1.." + DIMENSION_TABLERO + "]: ");
			int fila = Sudoku.leerEntero(1, DIMENSION_TABLERO);
			System.out.print("Introduzca una columna [1.." + DIMENSION_TABLERO + "]: ");
			int columna = Sudoku.leerEntero(1, DIMENSION_TABLERO);
			System.out.print("Introduzca un numero [1.." + DIMENSION_TABLERO + "]: ");
			int numero = Sudoku.leerEntero(1, DIMENSION_TABLERO);
			if (Sudoku.estaOcupada(celdas, fila, columna)) {
				System.out.println("ERROR: La celda [" + fila + "][" + columna + "] esta ocupada");
			} else if (Sudoku.estaEnFila(celdas, fila, numero)) {
				System.out.println("ERROR: El numero " + numero + " ya esta en la fila " + fila);
			} else if (Sudoku.estaEnColumna(celdas, columna, numero)) {
				System.out.println("ERROR: El numero " + numero + " ya esta en la columna " + columna);
			} else if (Sudoku.estaEnCaja(celdas, fila, columna, numero)) {
				System.out.println("ERROR: El numero " + numero + " ya esta en la caja "
						+ "de la celda [" + fila + "][" + columna + "]");
			} else {
				celdas[fila - 1][columna - 1] = numero;
				ocupacion++;
			}
			Sudoku.mostrar(celdas);
		}
		System.out.println("SUDOKU RESUELTO - ENHORABUENA");
	}

	public static int leerEntero(int minimo, int maximo) {
		Scanner scanner = new Scanner(System.in);
		int entero;
		do {
			entero = scanner.nextInt();
			scanner.nextLine();
		} while (entero < minimo || entero > maximo);
		return entero;
	}

	public static void mostrarLinea() {
		final int CAJAS = DIMENSION_TABLERO / DIMENSION_CAJA;
		final int GUIONES = 1 + 2 * (DIMENSION_CAJA + 1) * CAJAS;
		for (int i = 0; i < GUIONES; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	// TODO 1 ------------------------------------------------------------------------------------------
	public static void mostrar(int[][] celdas) {
		// SE PIDE escribir el codigo de esta funcion

		//TABLA
		mostrarLinea();//LLAMADO AL MÉTODO DE MOSTRAR LÍNEA
		for(int i=0;i<DIMENSION_TABLERO;i++){//FOR DE FILAS
			System.out.print("| ");//MOSTRAR UNA BARRA INICIAL
			for(int j=0;j<DIMENSION_TABLERO;j++){//FOR DE COLUMNAS
				if(celdas[i][j]!=0) System.out.print(celdas[i][j] + " ");//CONDICIÓN DE QUE SI LA CELDA ES DIFERENTE A CERO HACE UNA SEPARACIÓN
				else System.out.print("- ");//EN CASO CONTRARIO DE LA CONDICIÓN, IMPRIME UN "-"
				if(j==2 || j==5) System.out.print("| ");//MOSTRAR UNA BARRA FINAL
			}
			System.out.println("|"); //TERMINANDO EL FOR DE COLUMNAS HACE UN SALTO DE LÍNES + UNA BARRA
			if(i==2 || i==5) mostrarLinea(); // CONDICIÓN SI LAS FILAS SON 2 O 5 MUESTRA UNA EL MÉTODO LÍNEA
		}
		mostrarLinea();//LLAMADO AL MÉTODO DE MOSTRAR LÍNEA
	}

	// TODO 2 ------------------------------------------------------------------------------------------
	public static boolean estaOcupada(int[][] celdas, int fila, int columna) {//CONSIDERAR QUE ES FILA-1 Y COLUMNA-1 POR LAS POSICIONES DE LOS ARRAYS QUE SIEMPRE ES -1
		// SE PIDE escribir el codigo de esta funcion
		boolean resultado=false;//SE CREA UNA VARIABLE LOCAL TIPO BOOLEAN INICIALIZADO EN FALSE
		if(celdas[fila-1][columna-1]!=0) resultado = true;//CUANDO FILA Y COLUMNA DE LA CELDA ES DISTINTA DE CERO ES OCUPADA, VARIABLE LOCAL SIGUE SIENDO TRUE, SINO ESTÁ DESOCUPADA VARIABLE LOCAL SE VUELVE FALSE
		return resultado;//RETORNA VARIABLE LOCAL
	}

	// TODO 3 ------------------------------------------------------------------------------------------
	public static boolean estaEnFila(int[][] celdas, int fila, int numero) {
		// SE PIDE escribir el codigo de esta funcion
		boolean resultado = false;//SE CREA UNA VARIABLE LOCAL TIPO BOOLEAN INICIALIZADO EN FALSE
		for(int j=0;j<DIMENSION_TABLERO;j++){//FOR PARA QUE RECORRA LAS COLUMNAS DE ESA FILA
			if(celdas[fila-1][j]==numero) resultado = true;//CONDICIÓN SI EN EL RECORRIDO ALGÚN ELEMENTO ES IGUAL AL NÚMERO BUSCADO ENTONCES VARIABLE LOCAL SE VUELVE TRUE SINO SIGUE SIENDO FALSE
		}
		return resultado;//RETORNA VARIABLE LOCAL
	}

	// TODO 4 ------------------------------------------------------------------------------------------
	public static boolean estaEnColumna(int[][] celdas, int columna, int numero) {
		// SE PIDE escribir el codigo de esta funcion
		boolean resultado = false;//SE CREA UNA VARIABLE LOCAL TIPO BOOLEAN INICIALIZADO EN FALSE
		for(int i=0;i<DIMENSION_TABLERO;i++){//FOR PARA QUE RECORRA LAS FILAS DE ESA COLUMNA
			if(celdas[i][columna-1]==numero) resultado = true;//CONDICIÓN SI EN EL RECORRIDO ALGÚN ELEMENTO ES IGUAL AL NÚMERO BUSCADO ENTONCES VARIABLE LOCAL SE VUELVE TRUE SINO SIGUE SIENDO FALSE
		}
		return resultado;//RETORNA VARIABLE LOCAL
	}

	// TODO 5 ------------------------------------------------------------------------------------------
	public static boolean estaEnCaja(int[][] celdas, int fila, int columna, int numero) {
		// SE PIDE escribir el codigo de esta funcion
		boolean resultado = false;//SE CREA UNA VARIABLE LOCAL TIPO BOOLEAN INICIALIZADO EN FALSE

		int filaInicial = (((fila-1)/DIMENSION_CAJA)*DIMENSION_CAJA);//SE CREA VARIABLE TIPO ENTERO QUE RECIBE FILA-1 DIVIDIRLO ENTRE LA DIMENSIÓN DE LA CAJA Y EL ENTERO OBTENIDO MULTIPLICAR DE NUEVO POR DIMENSIÓN CAJA PARA OBTENER FILA INICIAL
		int columnaInicial = (((columna-1)/DIMENSION_CAJA)*DIMENSION_CAJA);////SE CREA VARIABLE TIPO ENTERO QUE RECIBE FILA-1 DIVIDIRLO ENTRE LA DIMENSIÓN DE LA CAJA Y EL ENTERO OBTENIDO PARA MULTIPLICAR DE NUEVO POR DIMENSIÓN CAJA PARA OBTENER COLUMNA INICIAL

		int contadorFila = filaInicial;//SE CREA CONTADOR DE FILA INICIALIZADA EN LA FILA INICIAL DE LA VARIABLE CREADA EN LA LÍNEA 194
		while(contadorFila<filaInicial+DIMENSION_CAJA && resultado==false){//MIENTRAS CONTADOR DE FILA ES MENOR A FILAINICIAL + DIMENSIÓN DE LA CAJA (=3) Y LA VARIABLE LOCAL SIGA SIENDO FALSE SIGUE EL BUCLE
			int contadorColu = columnaInicial;////SE CREA CONTADOR DE COLUMNA INICIALIZADA EN LA FILA COLUMNA DE LA VARIABLE CREADA EN LA LÍNEA 195
			while(contadorColu<columnaInicial+DIMENSION_CAJA && resultado==false){//MIENTRAS CONTADOR DE COLUMNA ES MENOR A COLUMNAINICIAL + DIMENSIÓN DE LA CAJA (=3) Y LA VARIABLE LOCAL SIGA SIENDO FALSE SIGUE EL BUCLE
				if(celdas[contadorFila][contadorColu]==numero) resultado = true;//SI EN EL RECORRIDODE LA CELDA ALGÚN ELEMENTO ES IGUAL AL NÚMERO BUSCADO LA VARIABLE LOCAL SE VUELVE TRUE
				contadorColu++;//CONTADOR DE COLUMNA AUMENTA EN 1
			}
			contadorFila++;//CONTADOR DE FILA AUMENTA EN 1
		}
		return resultado;//RETORNA VARIABLE LOCAL
	}
}
