import React from 'react'
import { Car } from '../../../../lib/types/types'
import Card from './cars/Card'

type Props = { cars:Car[] }

export default function CarList({ cars }: Props) {
  return (
    <div>
        <h1>CarList:</h1>
        <div className='grid grid-cols-3 md:grid-cols-4 gap-4'>
            {cars.map((car: Car) => (
            <Card car={car}/>
        ))}
        </div>
         
    </div>
  )
}