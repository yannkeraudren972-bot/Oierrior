# 🦆 Oierrior – Du Jeu de l’Oie au Dungeon Crawler

## 📌 Description
Ce projet est une extension du sujet **“Jeu de l’Oie”** proposé par Christelle Chaudet.  
L’objectif est de partir des règles classiques du **Jeu de l’Oie** pour concevoir un système évolutif vers un **Dungeon Crawler**, en appliquant des principes avancés de conception orientée objet :

- **Délégation**
- **Responsabilités**
- **Conception d’héritage**
- **Classes cachées**
- **Logger pour le suivi des actions**

Le projet sera développé en **Java**, avec une architecture propre et des packages pertinents.  
La conception sera visualisée via **PlantUML** pour garantir la cohérence.

---

## 🎯 Objectifs pédagogiques
- Comprendre et appliquer les **principes SOLID**.
- Mettre en place une **architecture modulaire**.
- Utiliser **GitHub** pour la gestion de version et la collaboration.
- Développer un **logger** pour tracer les événements du jeu.
- Préparer une base évolutive pour passer d’un jeu simple à un **Dungeon Crawler**.

---

## 🕹️ Règles du Jeu de l’Oie (Résumé)
- Plateau de **63 cases** disposées en spirale.
- **2 dés** pour avancer.
- Cases spéciales :
  - **Pont (6 → 12)**
  - **Hôtel (19)** : attendre 2 tours.
  - **Puits (31)** : attendre qu’on vous relève.
  - **Labyrinthe (42 → 30)**
  - **Prison (52)** : attendre qu’on vous relève.
  - **Mort (58)** : recommencer.
- Cases avec **oie** : relancer les dés.
- Pour gagner : atteindre **63 exactement**, sinon reculer.

[Source Wikipédia](https://fr.wikipedia.org/wiki/Jeu_dePackages** :
  - `model` : classes métier (Plateau, Case, Joueur, Dé, etc.)
  - `controller` : logique du jeu
  - `view` : affichage console (ou graphique si extension)
  - `utils` : logger, outils divers
- **Diagrammes UML** : générés avec **PlantUML** pour suivre la conception.

---

## ✅ Étapes de réalisation
1. **Créer le dépôt GitHub** et cloner en local.
2. Créer un **projet Java sous Eclipse** avec le même nom.
3. Mettre en place l’**architecture des packages**.
4. Implémenter les **règles du Jeu de l’Oie**.
5. Ajouter un **logger** pour tracer les actions.
6. Préparer l’extension vers un **Dungeon Crawler** (héritage, classes cachées).
7. Synchroniser régulièrement :  
   ```bash
   git add .
   git commit -m "Progression sur le projet"
