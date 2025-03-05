// Beispiel: Verwendung einer externen Bibliothek
import _ from 'lodash';

const numbers = [1, 2, 3, 4, 5];
console.log(_.reverse(numbers));  // Gibt [5, 4, 3, 2, 1] zurück

// Problem: Wenn Lodash aktualisiert wird und Funktionen ändern oder entfernt werden, bricht der Code
//weil man die bestimmte Bibliothek ja nicht besitzt