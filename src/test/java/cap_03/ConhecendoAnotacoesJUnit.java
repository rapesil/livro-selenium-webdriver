package cap_03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConhecendoAnotacoesJUnit {

    @BeforeClass
    public static void antesDaClasse() {
        System.out.println("Esse é o beforeClass");
    } 

    @Before
    public void antesDosMetodos() {
        System.out.println("Esse é o before");
    } 

    @Test
    public void meuTeste1() {
        System.out.println("Esse é o meuTeste1");
    } 

    @Test
    public void meuTeste2() {
        System.out.println("Esse é o meuTeste2");
    } 

    @After
    public void depoisDosMetodos() {
        System.out.println("Esse é o after");
    } 

    @AfterClass
    public static void depoisDasClasses() {
        System.out.println("Esse é o afterClass");
    } 
}