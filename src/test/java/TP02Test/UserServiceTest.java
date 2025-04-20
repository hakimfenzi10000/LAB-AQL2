package TP02Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;

    @InjectMocks
    private UserService userService;

    @Test
    void testCreerUtilisateur() throws ServiceException {
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        userService.creerUtilisateur(utilisateur);

        verify(utilisateurApiMock).creerUtilisateur(utilisateur);
    }
}