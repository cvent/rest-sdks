import type { Config } from 'jest';

const config: Config = {
  preset: 'ts-jest',
  testEnvironment: 'node',
  testMatch: ['<rootDir>/__tests__/**/*.test.ts'],
  transform: {
    '^.+\\.tsx?$': [
      'ts-jest',
      {
        tsconfig: '<rootDir>/tsconfig.tests.json'
      }
    ]
  },
  moduleNameMapper: {
    '^(\\.{1,2}/.+)\\.js$': '$1',
    '^@cvent/sdk/types$': '<rootDir>/src/types/index.ts',
    '^@cvent/sdk/models/errors$': '<rootDir>/src/models/errors/index.ts',
    '^@cvent/sdk/models/components$': '<rootDir>/src/models/components/index.ts',
    '^@cvent/sdk/models/operations$': '<rootDir>/src/models/operations/index.ts',
    '^@cvent/sdk$': '<rootDir>/src/index.ts'
  },
  testTimeout: 30000
};

export default config;
