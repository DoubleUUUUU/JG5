import React from 'react'
import Card from '../components/ui/cars/Card';
import { Car } from '../../../lib/types/types';
import CarList from '../components/ui/CarList';


type Props = {}



const cars: Car[] = [
  {
    "name": "Executive Saloon",
    "type": "BMW 5 Series",
    "color": "grey",
    "motor": {
      "serialNumber": 1234,
      "hp": 310
    }
  },
  {
    "name": "Executive Saloon",
    "type": "Mercedes-Benz E-Class",
    "color": "black",
    "motor": {
      "serialNumber": 5678,
      "hp": 340
    }
  },
  {
    "name": "Sporty Coupe",
    "type": "Audi A5",
    "color": "red",
    "motor": {
      "serialNumber": 9101,
      "hp": 280
    }
  },
  {
    "name": "Family SUV",
    "type": "Volvo XC60",
    "color": "blue",
    "motor": {
      "serialNumber": 1121,
      "hp": 330
    }
  },
  {
    "name": "Sports Car",
    "type": "Porsche Cayman",
    "color": "red",
    "motor": {
      "serialNumber": 3141,
      "hp": 300
    }
  },
  {
    "name": "Compact Hatchback",
    "type": "Volkswagen Polo",
    "color": "silver",
    "motor": {
      "serialNumber": 4152,
      "hp": 150
    }
  },
  {
    "name": "Off-Road Beast",
    "type": "Jeep Wrangler",
    "color": "green",
    "motor": {
      "serialNumber": 7283,
      "hp": 285
    }
  },
  {
    "name": "Luxury SUV",
    "type": "Range Rover Sport",
    "color": "black",
    "motor": {
      "serialNumber": 8394,
      "hp": 395
    }
  },
  {
    "name": "Muscle Car",
    "type": "Ford Mustang GT",
    "color": "yellow",
    "motor": {
      "serialNumber": 5467,
      "hp": 450
    }
  },
  {
    "name": "City Electric",
    "type": "Nissan Leaf",
    "color": "blue",
    "motor": {
      "serialNumber": 9823,
      "hp": 147
    }
  }
  
]


export default function Cars({}: Props) {
  return ( 
    <div>
      <h1>Cars</h1>
        <CarList cars={cars}/>

    </div>
  );
}
