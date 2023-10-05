/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pantalla_home;

import javax.sound.sampled.Clip;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucho
 */
public abstract class MusicBehaviorTest {
    public abstract MusicBehavior createInstance();
    
    @Test
    public final void testSonido(){
        MusicBehavior instancia = createInstance();
        instancia.sonido();
    }
       
}
