package br.com.alura.loja;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {
    Produto p = null;

    @Before
    public void start(){
        p = new Produto();
        p.setNome("matheus");
    }

    @Test
    public void test() {
        Assert.assertEquals("matheus", p.getNome());
    }

}
