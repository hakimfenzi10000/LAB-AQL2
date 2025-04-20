# TP2 - Tests Unitaires avec Mockito

## Exercice 4 - Jeu de dés

### Question 1: Objets à mocker
Les objets à mocker sont:
- `Banque`: Pour contrôler la solvabilité
- `Joueur`: Pour simuler différents comportements du joueur
- `De` (les deux dés): Pour contrôler les résultats des lancers

### Question 2: Scénarios de test
1. Jeu fermé → doit lever JeuFermeException
2. Joueur insolvable → ne doit pas lancer les dés
3. Somme des dés ≠ 7 → joueur perd sa mise
4. Somme des dés = 7 → joueur gagne 2x mise
5. Banque insolvable après gain → jeu se ferme

### Question 4: Test jeu fermé
C'est un test d'interaction car on vérifie qu'aucune méthode n'a été appelée sur les mocks.

### Question 5: Test joueur insolvable
Pour vérifier que les dés ne sont pas lancés, on utilise `verify(deMock, never()).lancer()`.
C'est un test d'interaction car on vérifie quelles méthodes ont été appelées.