import { Injectable } from '@nestjs/common';

// 단일 메소드를 사용하는 기본 서비스

@Injectable()
export class AppService {
  getHello(): string {
    return 'Hello World! 123';
  }
}
