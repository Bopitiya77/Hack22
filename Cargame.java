function readLine() {
    return inputString[currentLine++];
}
    
    // Create your Super Class Race and Sub Class Car here
class Car {

    constructor(playerName, nitro, speed) {
        this.playerName = playerName;
        this.nitro = nitro;
        this.speed = speed;
    }

    startRace() {
        return 'Race has started'
    }

    nitroBoost() {
        this.nitro -= 50
        this.speed += 50
    }

    accelerate() {
        this.nitro += 10
        this.speed += 20
    }
    
    endRace() {
        return `${this.playerName} is the winner`
    }

    applyBreak() {
        this.speed = 0
    }
}
    
function main() {

    const playerName = readLine();
    const nitro = JSON.parse(readLine());
    const speed = JSON.parse(readLine());

    const car1 = new Car(playerName, nitro, speed);

    console.log(car1.startRace());
    car1.nitroBoost();
    console.log(`Speed ${car1.speed}; Nitro ${car1.nitro}`);
    car1.accelerate();
    console.log(`Speed ${car1.speed}; Nitro ${car1.nitro}`);
    console.log(car1.endRace());
    car1.applyBreak();
    console.log(`Speed ${car1.speed}; Nitro ${car1.nitro}`);


}
