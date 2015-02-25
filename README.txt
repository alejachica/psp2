Proyecto PSP2
Conceptos avanzados de Ingenieria de Software
Especializacion en construccion de Software
Universidad de los Andes

Instrucciones para obtener el repositorio desde github:
Hacer clone al proyecto con la siguiente URL: https://github.com/alejachica/psp2.git
usuario: alejachica

Para ejecutar el programa localmente, ejecutar el siguiente comando:
mvn package
java -cp target/psp2-1.0-SNAPSHOT.jar edu.uniandes.ecos.psp2.vista.VistaConsola

Para ejecutar el progama desde Heroku, ingresar a la siguiente URL:
https://psp2-alejachica.herokuapp.com/

Estos son los datos para ejecutar los test.
Test 1
x = 1.1
dof = 9 
NumSeg = 10 
        
Test 2
x = 1.1812
dof = 10 
NumSeg = 10 
        
Test 3
x = 2.750 
dof = 30 
NumSeg = 10 

Los formatos de psp2 y los archivos de test se encuentran en : psp2\src\site\resources