export interface Motor {
    serialNumber: number;
    hp: number;
  }
  
  interface Car {
    name: string;
    type: string;
    color: string;
    motor: Motor;
  }