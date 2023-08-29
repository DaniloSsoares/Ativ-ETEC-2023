#define pinSensor1 7 




void setup(){
    pinMode(pinSensor1,INPUT);
    Serial.begin(9600);
}

void loop(){
    bool estadoSensor1 = digitalRead(pinSendor1);
    if(estadoSensor1){
        Serial.println("PRETO");
        }else{
            Serial.println("BRANCO (diferente de preto)");
    }
}