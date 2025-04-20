package TP02Test.jeu;


import org.example.TP2.jeu.Jeu;
import org.example.TP2.jeu.interfaces.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class JeuTest {
    @Mock private Banque banqueMock;
    @Mock private Joueur joueurMock;
    @Mock private De de1Mock, de2Mock;

    @Test
    public void testJeuFerme() {
        Jeu jeu = new Jeu(banqueMock);
        jeu.fermer();

        assertThrows(JeuFermeException.class, () -> {
            jeu.jouer(joueurMock, de1Mock, de2Mock);
        });

        verifyNoInteractions(joueurMock, de1Mock, de2Mock);
    }
}
