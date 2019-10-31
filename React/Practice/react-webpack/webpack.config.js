// ./webpack.config.js

const path = require("path");
const HtmlWebPackPlugin = require("html-webpack-plugin");
const MiniCssExtractPlugin = require("mini-css-extract-plugin");
const {CleanWebpackPlugin} = require("clean-webpack-plugin");

module.exports = {
  entry: "./src/index.js",
  output: {
    filename: "bundle.js",
    path: path.resolve(__dirname + "/build")
  },
  mode: "none",
  module: {
    rules: [
      {
        test: /\.(js|jsx)$/,
        exclude: "/node_modules",
        use: ['babel-loader'],
      },
      {
        test: /\.html$/,
        use: [
          {
            loader: "html-loader",
            options: { minimize: true }
          }
        ]
      },
      {
        test: /\.css$/,
        use: [MiniCssExtractPlugin.loader, 'css-loader']
      },
      {
        test: /\.scss$/,
        use: [MiniCssExtractPlugin.loader, "css-loader", "sass-loader"]
      }
    ]
  },
  plugins: [
    new HtmlWebPackPlugin({
      template: './public/index.html', // public/index.html 파일을 읽는다.
      filename: 'index.html' // output으로 출력할 파일은 index.html 이다.
    }),
    new MiniCssExtractPlugin({
      filename: 'style-test.css'
    }),
    new CleanWebpackPlugin()
  ]
};

/* 
entry : 웹팩이 빌드할 파일을 알려주는 역할
        여기서는 src/test.js 파일 기준으로 import 되어 있는 모든 파일들을 찾아
        하나의 파일로 합치게 된다.
output : 웹팩에서 빌드를 완료하면 output에 명시되어 있는
         정보를 통해 빌드 파일을 생성
mode : 웹팩 빌드 옵션
       production : 최적화되어 빌드 되어지는 특징
       development : 빠르게 빌드하는 특징
       none : 아무 기능 없이 웹팩으로 빌드
*/