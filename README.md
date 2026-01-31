# TP1 : Inversion de Contrôle (IoC) avec Spring
#### Polytech Paris-Saclay - Frameworks Profesionnels
#### **Auteur** : Marko Babic

Ce projet est une mise en pratique des concepts d'**Inversion de Contrôle (IoC)** et d'**Injection de Dépendances (DI)** utilisant le framework **Spring**.

## Objectifs
* Comprendre le couplage fort vs couplage faible.
* Mettre en œuvre l'injection de dépendances (Constructeur vs Setter).
* Comparer la configuration XML et les Annotations Java (`@Component`, `@Autowired`).

## Technologies
* **Java** : 17+
* **Framework** : Spring Context 6.2.7
* **Build Tool** : Maven

## Architecture
* **Interface** : `MessageSender`
* **Implémentations** : `EmailSender`, `SmsSender`
* **Service** : `NotificationService`
* **Configuration** : `applicationContext.xml`

## Pour lancer le projet
1. **Cloner** le projet.
2. **Compiler** avec Maven (recharger les dépendances).
3. **Exécuter** le main.java
