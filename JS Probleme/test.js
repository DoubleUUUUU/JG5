function add(a, b) {
    return a + b;
  }
  
  console.log(add(5, "5")); // Gibt "55" zurück, anstatt eine Zahl zu addieren


  // Problem: Hier wird die Zahl 5 mit einem String "5" zusammengefügt. 
  // JavaScript erzwingt keine Typprüfung und führt eine automatische Typumwandlung durch 
  // (Stringverkettung statt Addition). 
  // Dies kann zu schwer erkennbaren Fehlern führen.