FROM node:18

WORKDIR /usr/src/app

COPY nodejs/package*.json ./

RUN npm install

COPY nodejs/. .

ENV PORT 8080

EXPOSE ${PORT}

CMD [ "node", "index.js" ]
