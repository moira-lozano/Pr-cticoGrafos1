/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.mycompany.practico2MoiraLozano.grafos.NoPesados.AlgoritmoWarshall;
import com.mycompany.practico2MoiraLozano.grafos.NoPesados.DiGrafo;
import com.mycompany.practico2MoiraLozano.grafos.NoPesados.Grafo;
import com.mycompany.practico2MoiraLozano.grafos.NoPesados.OrdenTopologico;
import com.mycompany.practico2MoiraLozano.grafos.NoPesados.componentesFuertementeConexa;
import com.mycompany.practico2MoiraLozano.grafos.pesados.DiGrafoPesado;
import com.mycompany.practico2MoiraLozano.grafos.pesados.Dijkstra;
import com.mycompany.practico2MoiraLozano.grafos.pesados.FloydWarshall;
import com.mycompany.practico2MoiraLozano.grafos.pesados.FordFulkerson;
import com.mycompany.practico2MoiraLozano.grafos.pesados.GrafoPesado;
import com.mycompany.practico2MoiraLozano.grafos.pesados.Prim;
import excepciones.ExcepcionAristaNoExiste;
import excepciones.ExcepcionAristaYaExiste;
import excepciones.ExcepcionNroVerticesInvalido;
import kruskal.Kruskal;

/**
 *
 * @author Moira
 */
public class TestGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionNroVerticesInvalido, ExcepcionAristaYaExiste, ExcepcionAristaNoExiste {
        /**GRAFO NO DIRIGIDO SIN PESO**/
        Grafo grafo = new Grafo(8);
        grafo.insertarArista(0, 1);
        grafo.insertarArista(1, 3);
        grafo.insertarArista(2, 1);
        grafo.insertarArista(3, 2);
        //grafo.insertarArista(3, 4);
        grafo.insertarArista(4, 5);
        grafo.insertarArista(5, 7);
        grafo.insertarArista(6, 4);
        grafo.insertarArista(7, 6);
        /**GRAFO DIRIGIDO SIN PESO**/
        DiGrafo diGrafo = new DiGrafo(5);
        diGrafo.insertarArista(0, 1);
        diGrafo.insertarArista(0, 2);
        diGrafo.insertarArista(0, 3);
        diGrafo.insertarArista(0, 4);
        diGrafo.insertarArista(1, 3);
        diGrafo.insertarArista(2, 1);
        diGrafo.insertarArista(2, 4);
        diGrafo.insertarArista(3, 4);           
        System.out.println("********PR??CTICO 2********");
        System.out.println("1.Para un grafo no dirigido implementar el m??todo de insertar v??rtice, insertar arista \n "
                + "eliminar v??rtice, eliminar arista,cantidad de vertices, cantidad de aristas,grado de vertice \n");
        System.out.println("***GRAFO NO DIRIGIDO***");
        System.out.println(grafo);
        System.out.println("---Eliminar v??rtice 3---");
        grafo.eliminarVertice(3);
        System.out.println(grafo);
        System.out.println("INSERTAR VERTICE ");
        grafo.insertarVertice();
        System.out.println(grafo);
        System.out.println("INSERTAR ARISTA ");
        grafo.insertarArista(1, 3);
        System.out.println(grafo);
        System.out.println("---Cantidad de v??rtices ---" + grafo.cantidadDeVertices());
        System.out.println("---Cantidad de aristas ---" + grafo.cantidadDeAristas());
        System.out.println("---Grado de v??rtice 4 ---" + grafo.gradoDeVertice(4));
     
        System.out.println("***GRAFO DIRIGIDO***");
        System.out.println(diGrafo);
        System.out.println("2.Para un grafo no dirigido implementar el m??todo de insertar v??rtice, insertar arista \n "
                + "eliminar v??rtice, eliminar arista,cantidad de vertices, cantidad de aristas \n"
                + "grado de entrada de vertice y grado de salida de vertice");
        System.out.println("insertar vertice");
        diGrafo.insertarVertice();
        System.out.println(diGrafo);
        System.out.println("insertar arista");
        diGrafo.insertarArista(1, 4);
        System.out.println(diGrafo);
        System.out.println("ELIMINAR VERTICE");
        diGrafo.eliminarVertice(5);
        System.out.println(diGrafo);
        System.out.println("ELIMINAR ARISTA");
        diGrafo.eliminarArista(1,4);
        System.out.println(diGrafo);
        System.out.println("CANTIDAD DE VERTICES :" +diGrafo.cantidadDeVertices());
        System.out.println("---Cantidad de aristas ---:" +diGrafo.cantidadDeAristas());
        System.out.println("---Grado de entrada de vertice 1---: " +diGrafo.gradoDeEntradaDelVertice(1));
        System.out.println("---Grado de salida de vertice 1---: " +diGrafo.gradoDeSalidaDelVertice(1));

        System.out.println("3.Para un grafo dirigido implementar m??todo o clase para encontrar si \n"
                + "hay ciclos sin usar matriz de caminos: " 
                + diGrafo.hayCiclo());
        System.out.println("4.Para un grafo dirigido implementar un algoritmo para encontrar si el \n"
                + "grafo dirigido tiene ciclos sin usar matriz de camino : " + diGrafo.tieneCiclos());
        System.out.println();
        System.out.println("5.Para un grafo dirigido implementar un m??todo o clase que sea capas \n"
                + "de retornar los componentes de las islas que existen en dicho digrafo: ");
        diGrafo.componentesDeLasIslas();
        System.out.println();

        System.out.println("7.Para un grafo dirigido implementar un m??todo o clase para encontrar si \n"
                + " el digrafo es d??bilmente conexo: " + diGrafo.esDebilmenteConexo());
        System.out.println();

        System.out.println("9.Para un grafo no dirigido implementar un algoritmo para encontrar \n"
                + "que en que v??rtices del grafo hay ciclos: " 
                + grafo.pregunta9());
        System.out.println("10.Para un grafo no dirigido implementar un algoritmo para encontrar\n"
                + "los componentes de las diferentes islas que hay en el grafo: " 
                + grafo.nroDeIslas());
        System.out.println();
        System.out.println("11.Para un grafo dirigido implementar un algoritmo para encontrar el \n"
                + "n??mero de islas que hay en el grafo: " 
                + diGrafo.cantidadDeIslas());
        System.out.println();
        AlgoritmoWarshall warshall = new AlgoritmoWarshall(diGrafo);
        System.out.println("12.Para un grafo dirigido implementar el algoritmo de Wharsall, que \n"
                + "luego muestre entre que v??rtices hay camino: ");
        System.out.println(warshall);
        DiGrafoPesado dgrafoPesado = new DiGrafoPesado(8);
        dgrafoPesado.insertarArista(0, 3, 50);
        dgrafoPesado.insertarArista(1, 0, 20);
        dgrafoPesado.insertarArista(1, 5, 20);
        dgrafoPesado.insertarArista(2, 4, 20);
        dgrafoPesado.insertarArista(2, 5, 30);
        dgrafoPesado.insertarArista(3, 4, 15);
        dgrafoPesado.insertarArista(3, 7, 70);
        dgrafoPesado.insertarArista(4, 3, 45);
        dgrafoPesado.insertarArista(4, 7, 40);
        dgrafoPesado.insertarArista(5, 7, 10);  
        dgrafoPesado.insertarArista(6, 0, 20);
        dgrafoPesado.insertarArista(6, 1, 40); 
        dgrafoPesado.insertarArista(6, 2, 10); 
        System.out.println("13.Para un grafo dirigido usando la implementaci??n del algoritmo de \n"
                + "Floyd-Wharsall encontrar los caminos de costo m??nimo entre un v??rtice a y el \n"
                + "resto. Mostrar los costos y cu??les son los caminos: ");
        System.out.println("***GRAFO DIRIGIDO PESADO***");
        System.out.println(dgrafoPesado);
        FloydWarshall floyd = new FloydWarshall(dgrafoPesado);
        floyd.mostrarCostosYCaminos(0);
        componentesFuertementeConexa componentes = new componentesFuertementeConexa();
        System.out.println("14.Para un grafo dirigido implementar un algoritmo que retorne cu??ntas \n"
                + "componentes fuertemente conexas hay en dicho grafo. Definimos formalmente un \n"
                + "componente fuertemente conectado, C, de un grafo G, como el mayor subconjunto de \n"
                + "v??rtices C (que es un subconjunto de los v??rtices del grafo G) tal que para cada \n"
                + "pareja de v??rtices v,w pertenecen a C tenemos una ruta desde v hasta w y una ruta \n"
                + "desde w hasta v: " 
                + componentes.nroDeComponentes(diGrafo) 
                + "\nComponentes Fuertemente Conexas -> " + componentes.mostrarComponentes());
        System.out.println();
        Dijkstra dijkstra = new Dijkstra(dgrafoPesado,0);
        System.out.println("15. Para un grafo dirigido pesado implementar el algoritmo de Dijkstra que \n"
                + "muestre con que v??rtices hay caminos de costo m??nimo partiendo desde un v??rtice v, \n"
                + "con qu?? costo y cu??les son los caminos: ");
        dijkstra.mostrarCaminosCostos(0);    
        System.out.println();
        GrafoPesado grafoPesado = new GrafoPesado(10);
        grafoPesado.insertarArista(0, 1, 5);
        grafoPesado.insertarArista(0, 2, 10);
        grafoPesado.insertarArista(0, 3, 8);
        grafoPesado.insertarArista(1, 3, 6);
        grafoPesado.insertarArista(1, 5, 5);
        grafoPesado.insertarArista(2, 3, 7);
        grafoPesado.insertarArista(2, 4, 8);
        grafoPesado.insertarArista(2, 7, 15);
        grafoPesado.insertarArista(3, 4, 5);
        grafoPesado.insertarArista(3, 5, 11);
        grafoPesado.insertarArista(4, 6, 4);
        grafoPesado.insertarArista(4, 7, 3);
        grafoPesado.insertarArista(5, 6, 9);
        grafoPesado.insertarArista(5, 8, 7);
        grafoPesado.insertarArista(6, 7, 12);
        grafoPesado.insertarArista(6, 8, 4);
        grafoPesado.insertarArista(6, 9, 6);
        grafoPesado.insertarArista(7, 9, 12);
        grafoPesado.insertarArista(8, 9, 7);       
        System.out.println("----GRAFO PESADO----");
        System.out.println(grafoPesado);
        Kruskal kruskal = new Kruskal(grafoPesado);
        System.out.println("16.Para un grafo no dirigido pesado implementar el algoritmo de Kruskal \n"
                + "que muestre cual es el grafo encontrado por el algoritmo: " 
                + kruskal.mostrarGrafoKruskal());
        Prim prim = new Prim(grafoPesado,0);       
        System.out.println("17.Para un grafo no dirigido pesado implementar el algoritmo de Prim que \n"
                + "muestre cual es el grafo encontrado por el algoritmo: " 
                + prim.mostrarGrafoPrim());
        OrdenTopologico ordenT = new OrdenTopologico(diGrafo);
        System.out.println("18.Para un grafo dirigido implementar al algoritmo de ordenamiento \n"
                + "topol??gico. Debe mostrar cual es el orden de los v??rtices seg??n este algoritmo: " 
                + ordenT.mostrarListaOrdenada());
        System.out.println();
        FordFulkerson ford = new FordFulkerson(dgrafoPesado);
        System.out.println("19.Para un grafo dirigido pesado implementar el algoritmo de Ford-Fulkerson: " 
                + ford.fordFulkerson(dgrafoPesado, 6, 7));
    }
    
}