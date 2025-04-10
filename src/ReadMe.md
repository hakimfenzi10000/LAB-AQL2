# Tests de couverture pour les exercices

# Exo1Test.java

### Exo 1 - Vérification de Palindrome

Ce projet contient une méthode `isPalindrome` qui permet de vérifier si une chaîne de caractères est un palindrome ou non. Un palindrome est une chaîne de caractères qui se lit de la même manière de gauche à droite et de droite à gauche, en ignorant la casse et les espaces.

### Fonctionnalités

La méthode `isPalindrome` réalise les étapes suivantes :
1. Elle vérifie si la chaîne est `null`. Si c'est le cas, elle retourne `false` (au lieu de lancer une exception).
2. Elle convertit la chaîne en minuscules et supprime tous les espaces blancs pour ignorer la casse et les espaces.
3. Elle utilise deux indices, `i` et `j`, pour comparer les caractères des deux extrémités de la chaîne.
4. Si les caractères aux positions `i` et `j` sont différents, la méthode retourne `false`.
5. Si toutes les comparaisons sont correctes, la méthode retourne `true`, ce qui signifie que la chaîne est un palindrome.

### Code de la méthode `isPalindrome`

```java
public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;  // Retourne false si la chaîne est null
        }
        s = s.toLowerCase().replaceAll("\\s+", "");  // Supprimer les espaces et ignorer la casse
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;  // Les caractères ne sont pas égaux
            }
            i++;  // Avancer l'index i
            j--;  // Reculer l'index j
        }
        return true;  // La chaîne est un palindrome
    }
}

```
Il ya aussi une erreur de frappe : permutation entre les variable i et j.
Dans la logique de la methode normalment on avancer l'index i et reculer l'index j .


# Exo2Test.java

Il y a une erreur de logique dans la boucle :
```java
for (int i = 0; i <= s1.length(); i++) { // ERREUR ici

```
Elle doit être : i < s1.length() au lieu de i <= s1.length() pour éviter un StringIndexOutOfBoundsException.

Correction de la ligne :
```java
for (int i = 0; i < s1.length(); i++) {
```
# Exo3Test.java


## Changement de la classe `BinarySearch` à `BinarySearchFixed`

### Contexte :
Lors de l'implémentation de l'algorithme de recherche binaire, une première version de la classe `BinarySearch` a été créée. Cependant, après quelques tests et la découverte de problèmes de couverture de branches, de lignes et de conditions, il a été nécessaire de corriger la logique de la classe. De plus, une modification a été apportée pour rendre la classe accessible à partir de tests situés dans d'autres packages.

### Modifications principales :

1. **Correction de la logique de la recherche binaire** :
    - L'ancienne version de la méthode de recherche binaire utilisait la condition `while (low < high)`, ce qui causait un problème dans le calcul de la position du `mid` lorsque `low` était égal à `high`. Pour corriger ce problème, la condition de la boucle a été modifiée en `while (low <= high)`. Cette modification garantit que tous les éléments sont correctement vérifiés, même lorsque `low` et `high` sont égaux.

   **Avant :**
   ```java
   while (low < high) {...}
   ```

   **Apres :**
   ```java
   while (low <= high) {...}
   ```
### Rendre la classe accessible au niveau du package :

La classe BinarySearch initiale était définie sans le modificateur public. Cela signifiait que la classe n'était accessible que depuis le même package, ce qui empêchait d'effectuer des tests depuis d'autres packages.

Pour résoudre ce problème et rendre la classe accessible dans les tests externes, le modificateur public a été ajouté à la déclaration de la classe


**Avant :**
  ```java
class BinarySearch { // Pas de modificateur 'public'
... 
}
  ```

**Apres :**
  ```java
public class BinarySearchFixed { // Ajout du modificateur 'public'
...
}
  ```
## Exercice 4 – Correction de la classe `QuadraticEquation` vers `QuadraticEquationFixed`

### Objectif :
Résoudre une équation quadratique de la forme `ax² + bx + c = 0` en retournant ses racines réelles.

### Problème de la version initiale :
- En cas de discriminant (`delta`) négatif, la méthode retournait `null`.
- Cela posait problème lors des tests de couverture (ex : conditionnelle, de branches), car l’appelant devait faire une vérification de nullité avant tout accès aux résultats.
- Le fait de retourner `null` est moins sûr et peut engendrer des `NullPointerException`.

###  Modifications apportées dans `QuadraticEquationFixed` :
1. **Retourner un tableau vide au lieu de `null` si `delta < 0`** :
   - Plus sécurisé, permet d'éviter les vérifications nulles.
   - Compatible avec les pratiques modernes de programmation (préférence pour les collections vides vs nulls).

   **Avant :**
   ```java
   if (delta < 0) {
       return null;
   }
**Après :**
```java
if (delta < 0) {
return new double[0];
}
```
2. **Rendre la classe public :**

La classe est maintenant accessible depuis les tests situés dans un package séparé.

**Avant :**
```java
class QuadraticEquation {
```
**Aprés:**
```java
public class QuadraticEquationFixed {

```

3. **Pourquoi ces modifications ?**


**Sécurité :** Retourner un tableau vide permet de prévenir les exceptions dues à la manipulation de null.

**Tests plus robustes :** Les outils de test peuvent itérer ou vérifier la taille du tableau retourné sans précautions supplémentaires.

**Cohérence :** Le comportement devient plus prévisible et mieux adapté à un traitement programmatique (ex : boucle sur les résultats, filtrage…).

##  Exercice 5 : `RomanNumeral.toRoman(int n)`

###  Problème

La méthode d'origine contenait deux erreurs :

- La boucle `for` utilisait la condition `i <= symbols.length`, ce qui entraînait une **`ArrayIndexOutOfBoundsException`**.
- La condition `while (n > values[i])` ignorait les cas où `n == values[i]`, ce qui empêchait la bonne conversion de certains entiers.

###  Correction (classe `RomanNumeralFixed`)

####  Modifications apportées

```diff
- for (int i = 0; i <= symbols.length; i++) {
+ for (int i = 0; i < symbols.length; i++) {
```

```diff
- while (n > values[i]) {
+ while (n >= values[i]) {
```

**Ces corrections assurent que :**

**On ne dépasse pas la taille du tableau,**

**On traite correctement les cas où n == values[i].**

**Couvertures de tests réalisées:**
**LineCoverageTest :** Vérifie que toutes les lignes de la méthode sont exécutées.

**BranchCoverageTest :** Couvre les différents embranchements logiques (if, while...).

**ConditionCoverageTest :** Teste les expressions conditionnelles avec diverses valeurs (limites, erreurs, etc.)

##  Exercice 6 : `FizzBuzz.fizzBuzz(int n)`

###  Problème

La méthode d'origine contient une **condition incorrecte** dans la validation de l'entrée.  
Elle rejette les valeurs `n = 1` alors qu'elles sont valides selon l'énoncé.

###  Correction (classe `FizzBuzzFixed`)

####  Modifications apportées

```diff
- if (n <= 1) {
+ if (n < 1) {
```
Cette correction permet d'accepter **n = 1** comme entrée valide, conformément à la consigne :

"Le nombre doit être positif" — 1 est un entier positif.

### Règles implémentées dans la méthode
**Si divisible par 3 :** retourne **"Fizz".**

**Si divisible par 5 :** retourne **"Buzz".**

**Si divisible par 3 et 5 :** retourne **"FizzBuzz".**

**Sinon :** retourne le nombre sous forme de **chaîne.**

### Couvertures de tests réalisées
**LineCoverageTest :** Chaque ligne de la méthode est exécutée au moins une fois.

**BranchCoverageTest :** Tous les cas de figure (chaque if) sont couverts.

**ConditionCoverageTest :** Chaque condition logique **(n % 3 == 0, n % 5 == 0, etc.)** est testée avec des cas vrais et faux.