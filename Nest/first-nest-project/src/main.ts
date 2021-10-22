import { NestFactory } from '@nestjs/core';
import { AppModule } from './app.module';

// main.ts : 핵심기능 NestFactory를 사용하여 Nest 애플리케이션 인스턴스를 생성하는 애플리케이션의 엔트리 파일
// main.ts에는 애플리케이션을 부트스트랩하는 비동기 함수가 포함되어 있다.
// create() 메소드는 INestApplication 인터페이스를 충족하는 애플리케이션 객체를 반환한다.

async function bootstrap() {
  const app = await NestFactory.create(AppModule);
  await app.listen(3000);
}
bootstrap();
